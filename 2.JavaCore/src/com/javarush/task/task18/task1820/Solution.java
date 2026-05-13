package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        try(BufferedReader oneFile = new BufferedReader(new FileReader(line));
        BufferedWriter twoFile = new BufferedWriter(new FileWriter(line))){
            ArrayList<Integer> list = new ArrayList<>();
            while (oneFile.ready()){
                int read = oneFile.read();
                list.add(read);
            }
        }
    }
}
