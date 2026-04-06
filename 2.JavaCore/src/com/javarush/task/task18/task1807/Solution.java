package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            int count = 0;
            while (inputStream.available() != 0) {
                int read = inputStream.read();
                if (read == 44) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}