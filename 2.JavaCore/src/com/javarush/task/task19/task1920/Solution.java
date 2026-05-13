package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader arg = new BufferedReader(new FileReader(args[0]))) {
            Map<String, Double> map = new HashMap<>();
            while (arg.ready()) {
                String string = arg.readLine();
                String[] split = string.split(" ");
                String name = split[0];
                double many = Double.parseDouble(split[1]);
                if (map.containsKey(name)) {
                    map.put(name, many + map.get(name));
                } else {
                    map.put(name, many);
                }
            }
            double max = 0.;
            for (Double value : map.values()) {
                if (value > max) {
                    max = value;
                }
            }

            for (String names : map.keySet()) {
                Double v = map.get(names);
                if (v.equals(max)){
                    System.out.println(names);
               }
            }
        }
    }
}


