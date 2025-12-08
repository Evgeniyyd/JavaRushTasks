package ru.javarush.java.core.level07.task18;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив строк длиной 6 элементов
        String[] warehouseSlots = new String[6];
        Arrays.fill(warehouseSlots,"Empty");
        System.out.println(Arrays.toString(warehouseSlots));


        // Заполняем все элементы массива значением "Empty" с помощью метода Arrays.fill


        // Выводим массив на экран в формате [Empty, Empty, Empty, Empty, Empty, Empty]

    }
}