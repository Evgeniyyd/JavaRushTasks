package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader consol = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(consol.readLine()))) {
            List<String> list = new ArrayList<>();
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    line = line.replaceAll("\\b" + entry.getKey() + "\\b", entry.getValue());
                }
                System.out.println(line);
            }
        }
    }
}