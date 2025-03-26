package com.javarush.task.pro.task09.task0918;

/* 
Поработаем со StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder str = new StringBuilder(string);
        for (String s : strings) {
            str.append(s);
        }
        return str;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder str1 = new StringBuilder(string);
        str1.replace(start, end, str);
        return str1;
    }
}
