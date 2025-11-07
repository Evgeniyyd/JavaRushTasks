package ru.javarush.java.core.level04.task17;

public class Solution {
    public static void main(String[] args) {
        // Внешний цикл для строк (i от 0 до 2)
        for (int i = 0; i <= 2; i++) {
            // Внутренний цикл для столбцов (j от 0 до 3)
            for (int j = 0; j <= 3; j++) {
                // Вывод координат текущей ячейки в формате i,j
                System.out.print(i + "," + j+" ");

                // Добавляем пробел между координатами в строке, кроме последней
                if ((i + j) % 2 != 0) {
                    System.out.print("+");

                }
            }
            System.out.println();
            // Переход на новую строку после завершения внутреннего цикла

        }
    }
}