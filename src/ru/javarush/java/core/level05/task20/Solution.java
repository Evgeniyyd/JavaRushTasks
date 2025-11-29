package ru.javarush.java.core.level05.task20;

public class Solution {
    public static void main(String[] args) {
        // Внешний цикл для чисел от 1 до 10 (строки таблицы)
        for (int i = 1; i <= 10; i++) {
            // Внутренний цикл для чисел от 1 до 10 (столбцы таблицы)
            for (int j = 1; j <= 10; j++) {

                int sum = i * j;
                // Вывод произведения с разделителем табуляции
                System.out.print(sum +"\t");
            }
            System.out.println();  // Переход на новую строку после завершения строки таблицы
        }
    }
}