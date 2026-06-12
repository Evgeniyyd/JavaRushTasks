package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(console.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(console.readLine()))){
            String line;
            while ((line = reader.readLine())!= null){
                String replaceAll = line.replaceAll("[\\p{P}\\n\\r]+", "");
                writer.write(replaceAll);
            }
        }
    }
}
