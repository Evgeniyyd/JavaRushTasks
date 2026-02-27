package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Самые редкие байты
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInput = new FileInputStream(reader.readLine())) {
            Map<Integer, Integer> map = new HashMap<>();
            while (fileInput.read() != -1) {
                int read = fileInput.read();
                if (!map.containsKey(read)) {
                    map.put(read, 1);
                } else {
                    map.put(read, map.get(read) + 1);
                }
            }
            Integer min = Collections.min(map.values());
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (min.equals(pair.getValue())) {
                    System.out.print(pair.getKey()+" ");
                }
            }
        }
    }
}
