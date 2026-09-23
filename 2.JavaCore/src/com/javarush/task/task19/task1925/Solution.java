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
                        list.add(splitStr + ",");
                        System.out.println(list);
                    }else{
                        continue;
                    }
                }
                StringBuilder builder = new StringBuilder();
                for (String array : list) {
                    builder.append(array);
                }
                String string = builder.toString();
                String substring = string.substring(0, string.length() - 1);
                writer.write(substring);
            }
        }
    }
}


