package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        boolean isEmpty = false;
        String regexPattern =  "^\\s*[#!].*";
        try (PrintWriter writer = new PrintWriter(outputStream)) {
            for (Map.Entry<String, String> stringEntry : runtimeStorage.entrySet()) {
                if (!isEmpty) {
                    String key = stringEntry.getKey();
                    String value = stringEntry.getValue();
                    if (key.matches(regexPattern)) {
                    } else {
                        writer.println(key + " " + value);
                    }
                }
            }
        }
    }
    public static void load(InputStream inputStream) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] split = line.split("=");
                String key = split[0];
                String value = split[1];
                runtimeStorage.put(key,value);
            }
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
