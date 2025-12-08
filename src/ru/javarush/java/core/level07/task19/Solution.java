package ru.javarush.java.core.level07.task19;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Исходный массив температур за день
int[] dailyTemperatures = new int[]{10, 20, 30, 40, 50, 60, 70};
        int[] ints = Arrays.copyOfRange(dailyTemperatures, 2, 5);

        // Копируем элементы с индексами 2 (включительно) до 5 (не включая 5): 30, 40, 50
        System.out.println(Arrays.toString(ints));

        // Выводим полученный подмассив в формате [30, 40, 50]
        
    }
}