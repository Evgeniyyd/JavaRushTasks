package com.javarush.task.task20.task2002;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            User user = new User("bdfd", "dfdfsd", new Date(), true, User.Country.RUSSIA);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            System.out.println(javaRush.equals(loadedObject));

            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            try (PrintWriter writer = new PrintWriter(outputStream)) {
                if (!users.isEmpty()) {
                    for (User user : users) {
                        String firstName = user.getFirstName();
                        String lastName = user.getLastName();
                        long birthDate = user.getBirthDate().getTime();
                        boolean male = user.isMale();
                        String country = String.valueOf(user.getCountry());
                        writer.println(firstName + " " + lastName + " " + birthDate + " "+male+" " + country);

                    }
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                while (reader.ready()) {
                    User user = new User();
                    String line1 = reader.readLine();
                    String[] split = line1.split(" ");
                    String firstName = split[0];
                    String lastName = split[1];
                    Date date = new Date(Long.parseLong(split[2]));
                   boolean male = Boolean.parseBoolean(split[3]);
                    String country = split[4];
                    user.setFirstName(firstName);
                    user.setLastName(lastName);
                    user.setMale(male);
                    user.setBirthDate(date);
                    user.setCountry(User.Country.valueOf(country));
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
