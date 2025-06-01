package com.javarush.task.task13.task1319;

import java.io.*;

import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            while (true) {
                String word= scanner.nextLine();
                bufferedWriter.write(word);
                bufferedWriter.newLine();
                if (word.equals("exit")) {
                    break;
                }
            }
        }
    }
}
