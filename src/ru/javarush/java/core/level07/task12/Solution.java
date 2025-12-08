package ru.javarush.java.core.level07.task12;

public class Solution {
    public static void main(String[] args) {
        // Создаем двумерный массив для хранения показаний (2 строки, 5 столбцов)
        int[][] sensorData = new int[2][5];
        // Начальное значение для заполнения массива
        int count = 10;
        for (int i = 0; i < sensorData.length; i++) {
            for (int j = 0; j < sensorData[i].length; j++) {
                // Заполняем массив по строкам, слева направо
                sensorData[i][j] = count;
                // Выводим массив в виде таблицы
                System.out.print(sensorData[i][j]);
                count++;
                if (j != sensorData[i].length-1){
                    System.out.print(" ");
                }
            }
            // Печатаем значение элемента

            // Если это не последний элемент в строке, добавляем пробел
            System.out.println();
               // После каждой строки переходим на новую
        }
    }
}