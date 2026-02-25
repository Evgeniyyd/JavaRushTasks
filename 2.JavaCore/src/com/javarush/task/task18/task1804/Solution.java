package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            Map<Integer, Integer> map = new HashMap<>();
            while (inputStream.read() != 0) {
                int read = inputStream.read();
                if (!map.containsKey(read)) {
                    map.put(read, 1);
                } else {
                    Integer value = map.get(read);
                    map.put(read, value + 1);
                }
            }
            Collection<Integer> minByte = map.values();
            Integer min = Collections.min(minByte);
            Set<Map.Entry<Integer, Integer>> set = map.entrySet();
            for (Map.Entry<Integer,Integer> pair: set){
                if (pair.getValue().equals(min)){
                    System.out.print(pair.getKey()+ " ");

                }
            }

        }
    }
}
