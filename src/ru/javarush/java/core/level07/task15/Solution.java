package ru.javarush.java.core.level07.task15;

public class Solution {
    public static void main(String[] args) {
        int[][] miniGameScores = new int[3][];
        // Создаем зубчатый массив с заданными значениями
        // Первая строка массива
        // Вторая строка массива
        // Третья строка массива
   miniGameScores[0] = new int[]{1,2};
   miniGameScores[1] = new int[]{3,4,5};
   miniGameScores[2] = new int[]{6};
   int count =0;
        // Переменная для хранения суммы всех элементов массива

        // Проходим по каждой строке массива
        for (int i = 0; i < miniGameScores.length; i++) {
            // Проходим по каждому элементу строки
            for (int j = 0; j < miniGameScores[i].length; j++) {
                // Добавляем значение элемента к общей сумме
                count += miniGameScores[i][j];

            }
        }
        System.out.println(count);
        // Выводим итоговую сумму на экран
    }
}