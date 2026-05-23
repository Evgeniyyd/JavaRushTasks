package com.javarush.task.task18.task1823;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//РЕШЕНИЕ ЧЕРЕЗ КОЛЕКЦИЮ
public class Solution1 {
    public final static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

    }

    public static class ReadThread extends Thread {
        String name;

        public ReadThread(String fileName) {
            this.name = fileName;

        }

        @Override
        public void run() {
            try {
                Map<Integer, Integer> map = new HashMap<>();
                FileInputStream inputStream = new FileInputStream(name);
                int bytes;
                while ((bytes = inputStream.read()) != -1) {
                    if (!map.containsKey(bytes)) {
                        map.put(bytes, 1);
                    } else {
                        map.put(bytes, map.get(bytes) + 1);
                    }
                }
                int maxCount = 0;
                int maxBytes = Integer.MAX_VALUE;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    Integer currentCount = entry.getValue();
                    Integer currentByte = entry.getKey();
                    if (currentCount > maxCount || (currentCount == maxCount && currentByte < maxBytes)) {
                        maxBytes = currentByte;
                        maxCount = currentCount;
                    }
                }
                synchronized (resultMap) {
                    resultMap.put(name, maxBytes);
                }
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
