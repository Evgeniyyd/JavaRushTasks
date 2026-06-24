package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader file = new BufferedReader(new FileReader(reader.readLine()))) {
            String line;
            String name;
            double parsed;
            Map<String, Double> map = new TreeMap<>();
            while ((line = file.readLine()) != null) {
                String[] split = line.split(" ");
                name = split[0];
                parsed = Double.parseDouble(split[1]);
                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + parsed);
                } else {
                    map.put(name, parsed);
                }
            }
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}

