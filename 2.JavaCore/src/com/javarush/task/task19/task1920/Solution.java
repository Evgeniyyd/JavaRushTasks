package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            String line;
            String name;
            Map<String, Double> map = new TreeMap<>();
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                name = split[0];
                double parsed = Double.parseDouble(split[1]);
                if (!map.containsKey(name)) {
                    map.put(name, parsed);
                } else {
                    map.put(name, map.get(name) + parsed);
                }
            }
            String maxKey = "";
            double maxValue= Double.NEGATIVE_INFINITY;
            Set<String> keySet = map.keySet();
            for (String key : keySet) {
                Double value = map.get(key);
                if (value > maxValue) {
                    maxValue = value;
                    maxKey = key;
                }
            }
            System.out.println(maxKey);
        }
    }
}
