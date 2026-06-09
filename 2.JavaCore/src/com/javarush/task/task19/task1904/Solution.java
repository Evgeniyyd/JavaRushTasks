package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args)throws IOException {
        String path = "D:\\MyProject\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1904\\file";
       Scanner scanner = new Scanner(new File(path));
       PersonScannerAdapter adapter = new PersonScannerAdapter(scanner);
        Person person= adapter.read();
        System.out.println(person);

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;


        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String string = fileScanner.nextLine();
            String[] split = string.split(" ");
            String surname = split[0];
            String names = split[1];
            String patronymic = split[2];
            int day = Integer.parseInt(split[3]);
            int mouth = Integer.parseInt(split[4]);
            int year = Integer.parseInt(split[5]);
            Calendar calendar = new GregorianCalendar(year, mouth - 1, day);
            return new Person(names, patronymic, surname, calendar.getTime());
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
