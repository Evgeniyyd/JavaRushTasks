package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String console;
        while ((console = reader.readLine()) != null) {
            if (console.equals("exit")) {
                break;
            }
            ReadThread thread = new ReadThread(console);
            thread.start();
        }
    }

    public static class ReadThread extends Thread {
        String name;

        public ReadThread(String fileName) {
            this.name = fileName;
            //implement constructor body
        }

        @Override
        public void run() {
            try (FileInputStream inputStream = new FileInputStream(name)) {
                Map<Integer, Integer> map = new HashMap<>();
                int key;
                while ((key = inputStream.read()) != -1) {
                    if (!map.containsKey(key)) {
                        map.put(key, 1);
                    } else {
                        map.put(key, map.get(key) + 1);
                    }
                }
                int count = 0;
                int maxByte = 0;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > count) {
                        count = entry.getValue();
                        maxByte = entry.getKey();
                    }
                }
                resultMap.put(name, maxByte);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



