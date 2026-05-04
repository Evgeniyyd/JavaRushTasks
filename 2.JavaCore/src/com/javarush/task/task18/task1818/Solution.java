package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileThree = new BufferedReader(new FileReader(reader.readLine()));
             BufferedReader fileTwo = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter fileOne = new BufferedWriter(new FileWriter(reader.readLine(),true))) {
            while (reader.ready()) {


            }
        }
    }
}
