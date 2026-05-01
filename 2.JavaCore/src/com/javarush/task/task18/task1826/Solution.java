package com.javarush.task.task18.task1826;

import java.io.*;

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
                if (args.length > 0 && args[1].equals("-e")) {
                    fileOutputName.write(fileName.read()+1);
                } else if (args[1].equals("-d")) {
                    fileOutputName.write(fileName.read()-1);
                }
            }
        }
    }
}

