package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился id=1
    }

    public static void main(String[] args) throws ParseException, NullPointerException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
        Person person = null;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        String name = args[i];
                        String sex = args[i + 1];
                        String bd = args[i + 2];
                        Date parse = dateFormat.parse(bd);
                        if (sex.equalsIgnoreCase("М")) {
                            person = Person.createMale(name, parse);
                        } else if (sex.equalsIgnoreCase("Ж")) {
                            person = Person.createFemale(name, parse);
                        }
                        allPeople.add(person);
                        int indexOf = allPeople.indexOf(person);
                        System.out.println(indexOf);

                    }
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            String name = args[i + 1];
                            String sex = args[i + 2];
                            String bd = args[i + 3];
                            Date parse = dateFormat.parse(bd);
                            if (sex.equalsIgnoreCase("М")) {
                                person = Person.createMale(name, parse);
                            } else if (sex.equalsIgnoreCase("Ж")) {
                                person = Person.createFemale(name, parse);
                            }
                            allPeople.set(id, person);
                        }
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    String stringSex = "";
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        if (id >= 0 && id < allPeople.size()) {
                            person = allPeople.get(id);
                            String name = person.getName();
                            Sex sex = person.getSex();
                            Date birthDate = person.getBirthDate();
                            String stringFormat = format.format(birthDate);
                            if (sex.equals(Sex.MALE)) {
                                stringSex = "M";
                            } else {
                                stringSex = "Ж";
                            }
                            System.out.println(name + " " + stringSex + " " + stringFormat);
                        }
                    }
                }
                break;
        }
    }
}


