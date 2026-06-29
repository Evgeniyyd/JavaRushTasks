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
    public static void main(String[] args) throws IOException {
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
}
