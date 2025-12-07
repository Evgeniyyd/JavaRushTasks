package com.javarush.task.task18.task1822;

import java.io.*;


/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            while (reader.ready()) {
                String line = reader.readLine();
                String[] split = line.split(" ");
                if (split[0].equals(args[0])) {
                    System.out.println(line);
                }
            }


        }
    }
}

