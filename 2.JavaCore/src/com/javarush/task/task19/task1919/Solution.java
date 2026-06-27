package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            String line;
            Map<String,Double> map = new TreeMap<>();
            String name;
            double parsed;
            while ((line = reader.readLine())!= null){
                String[] split = line.split(" ");
                 name = split[0];
                 parsed = Double.parseDouble(split[1]);
                if (map.containsKey(name)){
                    map.put(name,parsed);
                    }else {
                    map.put(name,map.get(name)+parsed);
                }
            }
            Collection<Double> values = map.values();
            map.entrySet()
                    .stream()
                    .map(Map.Entry::getValue);


        }
    }
}
