package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new HashMap<>();
            while (reader.ready()) {
                String string = reader.readLine();
                String[] split = string.split(" ");
                String name = split[0];
                double value = Double.parseDouble(split[1]);
                if (map.containsKey(name)) {
                    map.put(name, value + map.get(name));
                } else {
                    map.put(name, value);
                }
            }
            Double max = 0.0;
            for (Double value : map.values()) {
                if (value > max) {
                    max = value;
                }
            }
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                Double value = entry.getValue();
                String key = entry.getKey();
                if (max.equals(value)) {
                    System.out.println(key);
                }
            }
        }
    }
}

