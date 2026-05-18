package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try(FileInputStream file = new FileInputStream(new File(reader.readLine()))){
        String fileName = "";
        try {
            while (file.read() != -1) {
               fileName = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName);
        }
    }
}
}

