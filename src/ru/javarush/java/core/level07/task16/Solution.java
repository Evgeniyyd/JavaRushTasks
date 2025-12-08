package ru.javarush.java.core.level07.task16;

public class Solution {
    public static void main(String[] args) {
        // Создаем зубчатый массив с заданным количеством элементов в каждой строке
        int[][] zoneTemperatures = new int[3][];
        // Зона A: три датчика
        // Зона B: два датчика
        // Зона C: четыре датчика
        zoneTemperatures[0] = new int[]{23, 12, 14};
        zoneTemperatures[1] = new int[]{12, 3};
        zoneTemperatures[2] = new int[]{12, 2, 12, 43};
        // Инициализируем переменную для хранения максимального значения
        int count = 0;
        // Проходим по всем элементам зубчатого массива
        for (int i = 0; i < zoneTemperatures.length; i++) {
            for (int j = 0; j < zoneTemperatures[i].length; j++) {
                // Обновляем максимальное значение, если текущая температура больше
                if (count < zoneTemperatures[i][j]) {
                    count = zoneTemperatures[i][j];
                }
            }
        }
        System.out.println(count);
        // Выводим максимальное значение температуры на экран
    }
}