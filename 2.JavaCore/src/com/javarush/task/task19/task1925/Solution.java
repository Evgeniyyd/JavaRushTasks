package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            String line;
            while (reader.ready()) {
                List<String> list = new ArrayList<>();
                line = reader.readLine();
                String[] split = line.split(" ");
                for (String splitStr : split) {
                    if (splitStr.length() > 6) {
                        list.add(splitStr+",");

                    }
                }
                List<String> arrays = list.stream().map(str -> list.indexOf(str) == list.size()-1
                        ? str.substring(0, str.length() - 1) : str).toList();
                for (String array : arrays) {
                    writer.write(array);
                    System.out.println(array);
                }
            }
        }
    }
}

