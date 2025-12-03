package ru.javarush.java.core.level06.task11;

public class Solution {
    public static void main(String[] args) {
        // Вычисляем квадратный корень из -1 с помощью Math.sqrt
        double mysticAnomaly = Math.sqrt(-1);
        System.out.println(mysticAnomaly);
        // Выводим значение mysticAnomaly на экран

        boolean naN = Double.isNaN(mysticAnomaly);
        System.out.println(naN);
        // Проверяем, является ли mysticAnomaly NaN (Not a Number)


        // Выводим результат проверки на экран

    }
}