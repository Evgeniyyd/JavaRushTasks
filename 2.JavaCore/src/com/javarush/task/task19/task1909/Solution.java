package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileOne = new BufferedReader(new FileReader(console.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))) {
            String line;
            while ((line = fileOne.readLine()) != null) {
                String replaceAll = line.replaceAll("\\.", "!");
                writer.write(replaceAll);
            }
        }
    }
}
