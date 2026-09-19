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
            List<String> list = new ArrayList<>();
            while (reader.ready()) {
                line = reader.readLine();
                String[] split = line.split(" ");
                for (String splitStr : split) {
                    if (splitStr.length() > 6) {
                        list.add(splitStr + ",");
                    }
                }
                List<String> arrays = list.stream().map(s -> s.equals(list.get(list.size()-1))
                        ? s.substring(0, s.length() - 1) : s).toList();
                for (String array : arrays) {
                    writer.write(array+",");
                    System.out.println(array);
                }
            }
        }
    }
}

