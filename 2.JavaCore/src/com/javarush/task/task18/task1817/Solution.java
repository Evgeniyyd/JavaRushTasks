package com.javarush.task.task18.task1817;

import java.io.*;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream reader = new FileInputStream(args[0])) {
            int count = 0;
            int countSpace = 0;
            int read;
            while ((read = reader.read()) != -1) {
                if (read == 32) {
                    countSpace++;
                }
                count++;
            }
            double parsed = (double) countSpace / count * 100;
            System.out.printf("%.2f", parsed);
        }
    }
}