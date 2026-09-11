package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
            while (reader.ready()) {
                String line = reader.readLine();
                list.add(line);
            }
        }
        for (String file : list) {
            int count = 0;
            String[] split = file.split(" ");
            for (int i = 0; i < split.length; i++) {
                for (String word : words) {
                    if (split[i].equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            if (count == 2) System.out.println(file);
            }
        }
    }


