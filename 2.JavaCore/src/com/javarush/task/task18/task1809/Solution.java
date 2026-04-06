package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine());
             FileOutputStream outputStream = new FileOutputStream(reader.readLine())) {
            ArrayList<Integer> list = new ArrayList<>();
            while (inputStream.available() != 0) {
                int read = inputStream.read();
                list.add(read);
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                outputStream.write(list.get(i));
            }
        }
    }
}

