package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/
//РЕШЕНИЕ ЧЕРЕЗ МАССИВЫ
public class Solution {
    public final static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        while (true) {
            if (line.equals("exit")) {
                break;
            }
            ReadThread thread = new ReadThread(line);
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
            try {
                FileInputStream inputStream = new FileInputStream(name);
                int[] arrys = new int[256];
                int count;
                while ((count = inputStream.read()) != -1) {
                    arrys[count]++;
                }
                int countByte = 0;
                int maxByte = 0;
                for (int i = 0; i < arrys.length; i++) {
                    if (arrys[i] > countByte) {
                        countByte = arrys[i];
                        maxByte = i;
                    }
                }
                synchronized (resultMap) {
                    resultMap.put(name, maxByte);
                }
                inputStream.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
