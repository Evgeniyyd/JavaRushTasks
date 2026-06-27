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
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
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
            //C использованием алгаритма и тд
//            Double maxValue = Collections.max(map.values());
//            List<String> list = new ArrayList<>();
//            for (Map.Entry<String, Double> entry : map.entrySet()) {
//                if (entry.getValue().equals(maxValue)) {
//                    list.add(entry.getKey());
//                }
//            }
//            for (String maxKey : list) {
//                System.out.println(maxKey);
//            }
            // С использованием stream()
            Double maxValue = Collections.max(map.values());
             map.entrySet().stream()
                     .filter(element -> element.getValue()
                             .equals(maxValue)).map(Map.Entry::getKey)
                     .toList();
        }
    }
}

