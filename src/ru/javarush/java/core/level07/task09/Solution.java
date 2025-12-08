package ru.javarush.java.core.level07.task09;

public class Solution {
    public static void main(String[] args) {
        // Объявляем двумерный массив theaterSeating размером 2 строки и 3 столбца
        int[][] theaterSeating = new int[2][3];
        // счётчик для присвоения значений
        int namber =1;
        // Заполняем массив числами от 1 до 6 по строкам
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                theaterSeating[i][j] = namber++;

                // присваиваем текущее значение и увеличиваем счётчик
            }
            // Выводим на экран элемент во второй строке и первом столбце (индекс [1][0])
        }
        System.out.println(theaterSeating[1][0]);
    }
}