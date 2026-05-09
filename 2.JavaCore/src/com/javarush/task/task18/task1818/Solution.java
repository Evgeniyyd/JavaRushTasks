package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fileOne = new FileOutputStream(reader.readLine(), true);
             FileInputStream fileTwo = new FileInputStream(reader.readLine());
            FileInputStream fileThree = new FileInputStream(reader.readLine())) {
            int one;
            while ((one = fileTwo.read()) != -1) {
             fileOne.write(one);
            }

            int two;
            while ((two = fileThree.read()) != -1){
               fileOne.write(two);
            }
        }
    }
}


