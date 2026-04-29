package com.javarush.task.task18.task1826;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File fileOne = new File("dsfd");
        File fileTwo = new File("kjjkjkj");
        try (FileInputStream fileName = new FileInputStream(fileOne);
             FileOutputStream fileOutputName = new FileOutputStream(fileTwo)) {
            while (fileName.available() > 0) {
                if (args.length > 0 && args[1].equals("-c")) {
                    String name = fileOne.getName();
                    char[] charArray = name.toCharArray();
                    for (int i = 0; i < charArray.length - 1; i++) {
                            char simbol = charArray[charArray.length-1];
                            charArray[i] = charArray[charArray.length-1];
                             simbol = charArray[i];
                        }
                    }
                }
            }
        }
    }

