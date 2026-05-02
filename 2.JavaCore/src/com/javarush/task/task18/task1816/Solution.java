package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        String alfabet = args[0];
        list.add(alfabet);
        try (FileReader reader = new FileReader(alfabet)) {
            int count = 0;
            while (reader.ready()){
                int read = reader.read();
                for (int i = 0; i < list.size(); i++) {
                    if (alfabet.equals("\\[a-zA-Z]\\")) {
                        count += i;
                        System.out.println(count);
                    }
                }
            }
        }
    }
}

