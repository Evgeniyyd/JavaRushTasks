package com.javarush.task.task18.task1819;

import java.io.*;


/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileOneRead = new FileInputStream(reader.readLine());
             FileOutputStream fileOneWrite = new FileOutputStream(reader.readLine())) {
            int fileTwo;
            while ((fileTwo = fileOneRead.read()) != -1) {
                //byte[] bytes = Files.readAllBytes(Paths.get(fileOneRead));
                fileOneWrite.write(fileTwo);
            }
        }
    }
}
