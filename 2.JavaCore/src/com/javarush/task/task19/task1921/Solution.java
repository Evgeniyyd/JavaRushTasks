package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.format.DateTimeFormatter;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        StringBuilder builder = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String string = fileReader.readLine();
            String[] split = string.split(" ");
            String year = split[split.length - 1];
            String month = split[split.length - 2];
            String day = split[split.length - 3];




            for (int i = 0; i < split.length-3; i++) {
                builder.append(split[i]).append(" ");
            }
            String name = builder.toString().trim();

        }
    }
}
