package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        while (true){
            if (line.equals("exit")){
                break;
            }
            try {
                if (line.contains(".")){
                    print(Double.parseDouble(line));
                }
                int parseInt = Integer.parseInt(line);
                if (parseInt > 0 && parseInt <128){
                    print((short) parseInt);
                }else {
                    print(parseInt);
                }
            } catch (Exception e) {
                print(line);
            }
            break;
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
