package ru.javarush.java.core.level03.task04;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную currentHour и присваиваем ей значение 20

int currentHour =20;
        // Используем оператор if-else if-else для выбора нужного приветствия
        if (currentHour < 12) {
            System.out.println("Доброе утро!");
            // Если текущее время меньше 12, считаем, что это утро

        } else if (currentHour >= 12 && currentHour <= 18) {
            System.out.println("Добрый день!");
            // Если текущее время от 12 до 18 включительно, считаем, что это день

        } else {
            System.out.println("Добрый вечер!");
            // Во всех остальных случаях считаем, что это вечер

        }
    }
}