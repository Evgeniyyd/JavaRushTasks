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
        while (true) {
            String line = reader.readLine();
            if (line.equals("exit")) {
                break;
            }
            ReadThread readThread = new ReadThread(line);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        public String name;

        public ReadThread(String fileName) {
            this.name = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(name);
                int bytes;
                int[] array = new int[256];
                while ((bytes = inputStream.read()) != -1) {
                    array[bytes]++;
                }
                int maxCount = 0;
                int maxByte = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > maxCount) {
                        maxCount = array[i];
                        maxByte = i;
                    }
                }
                resultMap.put(name, maxByte);
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}