package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> collect = reader.lines().filter(Objects::nonNull)
                    .map(lines -> lines.split(" "))
                    .collect(Collectors.toMap(string -> string[0],
                            strings -> Double.parseDouble(strings[1]),
                            (nam, sum) -> nam + sum));

            collect.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .map(entry -> entry.getKey() + " " + entry.getValue())
                    .forEach(System.out::println);
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new TreeMap<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                String name = split[0];
                double parsed = Double.parseDouble(split[1]);
                if (!map.containsKey(name)) {
                    map.put(name, parsed);
                } else {
                    map.put(name, map.get(name) + parsed);
                }
            }
            List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());
                list.sort(Map.Entry.comparingByKey());
            for (Map.Entry<String, Double> entry : list) {
                System.out.println(entry.getKey()+" "+ entry.getValue());
            }
        }
    }
}
