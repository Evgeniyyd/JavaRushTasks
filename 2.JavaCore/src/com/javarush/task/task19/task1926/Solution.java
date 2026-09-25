package com.javarush.task.task19.task1926;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
               String line;
            while (fileReader.ready()){
                line = fileReader.readLine();
                StringBuilder builder = new StringBuilder(line);
                System.out.println(builder.reverse());
            }
        }
    }
}
