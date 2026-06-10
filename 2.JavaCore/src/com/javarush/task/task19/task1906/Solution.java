package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileOne = new FileReader(console.readLine());
             FileWriter writer = new FileWriter(console.readLine())) {
            int count;
            int counter = 1;
            while ((count = fileOne.read()) != -1) {
                if (counter % 2 == 0) {
                    writer.write(count);
                }
                counter++;
            }
        }
    }
}

