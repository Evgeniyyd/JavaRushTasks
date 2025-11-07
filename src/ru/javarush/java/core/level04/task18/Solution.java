package ru.javarush.java.core.level04.task18;

public class Solution {
    public static void main(String[] args) {
        // Внешний цикл отвечает за строки (5 строк)
        for (int i = 0; i < 5; i++) {
            // Внутренний цикл отвечает за столбцы (7 столбцов)
            for (int j = 0; j < 7; j++) {
                System.out.print("⭐" + " ");
                // Выводим символ "⭐" с пробелом

            }
            // После завершения строки переходим на новую строку
            System.out.println();
        }
    }
}