package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;

/* 
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
             FileWriter writer = new FileWriter(reader.readLine())) {
            ArrayList<String> list = new ArrayList<>();
            while (reader.ready()) {
                String string = reader.readLine();
                list.add(string);
            }
            if (args[0].equals("-u")) {
                String idIsArgs = args[1];
                String line = args[2];
                for (String str : list) {
                    String idIsFile = str.substring(0, 8).trim();
                    if (idIsArgs.equals(idIsFile)) {


                    }
                }
            }
        }
    }
}



