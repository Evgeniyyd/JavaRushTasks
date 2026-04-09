package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        int sum = 0;
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] split = line.split("\\p{P}");
            int count = 0;
            for (String line1 : split) {
                if (line1.equals("world")) {
                    count++;
                }
            }
            sum += count;
        }
        System.out.println(sum);
    }
}
