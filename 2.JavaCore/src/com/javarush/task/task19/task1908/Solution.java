package com.javarush.task.task19.task1908;

import java.io.*;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader comsole = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(comsole.readLine()));
           BufferedWriter writer = new BufferedWriter(new FileWriter(comsole.readLine()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.split(" ");
                for (String lines : split) {
                    if (lines.matches("\\d+")) {
                        writer.write(lines + " ");
                    }
                }
            }
        }
    }
}
