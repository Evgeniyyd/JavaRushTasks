package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (FileInputStream inputStream = new FileInputStream(reader.readLine())) {
            int count = 0;
            char ascii_symbola =',';
            while (inputStream.read() != 0) {
               int read = inputStream.read();
                if (ascii_symbola == 44){

                }
                System.out.println(count);


            }

        }
    }
}