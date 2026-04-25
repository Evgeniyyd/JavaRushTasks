package com.javarush.task.task18.task1828;

import java.awt.*;
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
            if (args.length > 0 && args[0].equals("-u")) {
                String format = "";
                String idIsArgs = args[1];
                for (int i = 0; i < list.size(); i++) {
                    String idIsFile = list.get(i).substring(0, 8).trim();
                    if (idIsArgs.equals(idIsFile)) {
                        String productName = args[2];
                        String price = args[3];
                        String quantity = args[4];
                        format = String.format("%-8.8s%-30.30s%-8.8s%-4.4s",
                                idIsArgs, productName, price, quantity);
                        list.set(i, format);

                    }
                    writer.write(format);
                }
            }
            if (args.length > 0 && args[0].equals("-d")) {
                String idIsArgs = args[1];
                for (int i = 0; i < list.size(); i++) {
                    String idIsFile = list.get(i).substring(0, 8).trim();
                    if (idIsArgs.equals(idIsFile)) {
                        list.remove(i);
                        i--;
                    }
                }
            }
        }
    }
}





