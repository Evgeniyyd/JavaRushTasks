package ru.javarush.java.core.level07.task20;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Создаем основной код доступа
        int[] mainCode ={3,6,9,12};
        // Создаем резервный код доступа
        int[]backupCode ={3,6,9,12};
        boolean equals = Arrays.equals(mainCode, backupCode);

        System.out.println(equals);


        // Сравниваем содержимое двух массивов поэлементно с помощью Arrays.equals


        // Выводим результат сравнения (true, если массивы идентичны, иначе false)

    }
}