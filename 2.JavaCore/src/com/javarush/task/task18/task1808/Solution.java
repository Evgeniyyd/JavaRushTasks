package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();
        try (FileInputStream inputFile1 = new FileInputStream(file1);
             FileOutputStream outputFile2 = new FileOutputStream(file2);
             FileOutputStream outputFile3 = new FileOutputStream(file3)
        ) {
            int half = (inputFile1.available() + 1) / 2;
            int count =0;
            while (inputFile1.available() >0){
                int read = inputFile1.read();
                if (count > half){
                    outputFile2.write(read);
                    count++;
                }else {
                    outputFile3.write(read);
                }
            }


        }
    }
}
