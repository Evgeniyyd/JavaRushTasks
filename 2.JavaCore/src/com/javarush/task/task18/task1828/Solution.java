package com.javarush.task.task18.task1828;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* 
Прайсы 2
*/

public class Solution {
    public static void main1(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            ArrayList<String> list = new ArrayList<>();

            while (reader.ready()) {
                String string = reader.readLine();
                list.add(string);
            }
            if (args.length > 0 && args[0].equals("-u")) {
                String idIsArgs = args[1];
                for (int i = 0; i < list.size(); i++) {
                    String idIsFile = list.get(i).substring(0, 8).trim();
                    if (idIsArgs.equals(idIsFile)) {
                        String productName = args[2];
                        String price = args[3];
                        String quantity = args[4];
                        String format = String.format("%-8.8s%-30.30s%-8.8s%-4.4s",
                                idIsArgs, productName, price, quantity);
                        list.set(i, format);
                    }
                }
            } else if (args.length > 0 && args[0].equals("-d")) {
                String idIsArgs = args[1];
                for (int i = 0; i < list.size(); i++) {
                    String idIsFile = list.get(i).substring(0, 8).trim();
                    if (idIsArgs.equals(idIsFile)) {
                        list.remove(i);
                        i--;
                    }
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (String line : list) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }

    //РЕШЕНИЕ ЧЕРЕЗ MAP КОЛЕКЦИЮ

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        Map<String, String> map = new HashMap<>();
        try (BufferedReader bufer = new BufferedReader(new FileReader(fileName))) {

            while (bufer.ready()) {
                String line = bufer.readLine();
                String idIsFile = line.substring(0, 8).trim();
                map.put(idIsFile, line);
            }
            if (args[0].equals("-u")) {
                String idIsArgs = args[1];
                if (map.containsKey(idIsArgs)) {
                    String productName = args[2];
                    String price = args[3];
                    String quantity = args[4];
                    String format = String.format("%-8.8s%-30.30s%-8.8s%-4.4s",
                            idIsArgs, productName, price, quantity);
                    map.put(idIsArgs,format);
                }
            }else if (  args[0].equals("-d")){
                String idIsArgs = args[1];
                if (map.containsKey(idIsArgs)){
                    map.remove(idIsArgs);
                }
            }
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
             for (Map.Entry<String,String> entry : map.entrySet()){
                 writer.write(entry.getKey() + " "+entry.getValue());
             }
        }
    }
}





