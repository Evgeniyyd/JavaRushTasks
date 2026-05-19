package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] split = line.split(" ");
                if (split.length >= 4) {
                    String day = split[split.length - 3];
                    int indexOf = line.indexOf(day);
                    String name = line.substring(0, indexOf).trim();
                    String birthDate = line.substring(indexOf).trim();
                    Date parse = format.parse(birthDate);
                    PEOPLE.add(new Person(name, parse));
                }
            }
        }
    }
}
