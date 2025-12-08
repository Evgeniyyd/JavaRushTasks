package ru.javarush.java.core.level07.task17;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив с заданными значениями
        int[] raceTimes = new int[]{7,2,9,4,1};
       Arrays.sort(raceTimes);

        // Сортируем массив по возрастанию с помощью метода Arrays.sort

        System.out.println(Arrays.toString(raceTimes));
        // Выводим отсортированный массив на экран с использованием Arrays.toString

    }
}