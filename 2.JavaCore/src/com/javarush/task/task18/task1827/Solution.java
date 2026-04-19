package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {

            int max = 0;
            while (reader.ready()) {
                String string = reader.readLine();
                int id = Integer.parseInt(string.substring(0, 8).trim());
                if (id > max) {
                    max = id;
                }
            }
               if (args.length > 0 && args[0].equals("-c")) {
                   String productName = args[1];
                   String price = args[2];
                   String quantity = args[3];
                   writer.newLine();
                   String format = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", max + 1, productName, price, quantity);
                   writer.write(format);
               }
        }
    }
}

