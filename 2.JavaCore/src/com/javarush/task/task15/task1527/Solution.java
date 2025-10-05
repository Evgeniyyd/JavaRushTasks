package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Парсер реквестов
*/


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int index = url.indexOf("?");
        String substring = url.substring(index + 1);
        String[] split = substring.split("&");
        for (String string : split) {
            if (string.contains("=")) {
                int index1 = string.indexOf("=");
                String sub = string.substring(0, index1);
                System.out.print(sub + " ");
            } else {
                System.out.print(string + " ");
            }
        }
        System.out.println();
        for (String str : split) {

            if (str.contains("obj")) {
                int indexOf = str.indexOf("=");
                String substring1 = str.substring(indexOf+1);
                try {
                    double parsed = Double.parseDouble(substring1);
                    alert(parsed);
                } catch (RuntimeException e) {
                    alert(substring1);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
