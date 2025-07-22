package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.TreeMap;


/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Integer, String> map = new TreeMap<>();
        while (true) {
            String string = bufferedReader.readLine();
            if (string.contains("end")) {
                break;
            }
            int index = string.lastIndexOf("t");
            String substring = string.substring(index + 1);
            int number = Integer.parseInt(substring);
            map.put(number, string);

        }

        for (String fullFileName : map.values()) {
            int index = fullFileName.lastIndexOf(".");
            String shortFileName = fullFileName.substring(0, index);
            try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(fullFileName));
                 BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(shortFileName, true))) {
                while (input.available() > 0) {
                    output.write(input.read());
                }
            }
        }
    }
}
//как работает мапы перечитать
