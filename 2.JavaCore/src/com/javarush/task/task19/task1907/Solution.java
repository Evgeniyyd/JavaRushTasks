package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;



/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()))) {
            int count = 0;
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] split = line.replaceAll("\\p{P}"," ").split(" ");
                for (String line1 : split) {
                    if (line1.equals("world")) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    //функциональный подход
        public static void main1 (String[]args) throws IOException {
            System.out.println(Files.readAllLines(Paths.get(new Scanner(System.in).nextLine()))
                    .stream().map(str -> str.replaceAll("\\p{P}"," ").split(" "))
                    .flatMap(strings -> Arrays.stream(strings))
                    .filter(str -> str.equals("world")).count());
        }
    }
