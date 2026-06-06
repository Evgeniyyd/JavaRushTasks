package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {
        var date = new Date("21.29.2008");
        Person person = new Person("bdfyjd", "dkssdjsdksdk", "ksdkdsk", date);
        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;


        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String birthDate;
            String name;
            Person person;
            try (FileInputStream fileInputStream = new FileInputStream(fileScanner.nextLine());
                 InputStreamReader reader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                 BufferedReader fileReader = new BufferedReader(reader)) {
                String string = fileReader.readLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                name = string.replaceAll("[0-9]", "").trim();
                String[] split = name.split(" ");
                String surname = split[0];
                String names = split[1];
                String patronymic = split[2];
                birthDate = string.replaceAll("\\D ", "").trim();
                LocalDate parse = LocalDate.parse(birthDate,formatter);
                Date from = Date.from(Instant.from(parse));
                person = new Person(surname,names,patronymic,from);
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
