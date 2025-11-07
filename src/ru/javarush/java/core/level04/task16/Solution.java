package ru.javarush.java.core.level04.task16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Создаем объект Scanner для считывания ввода с клавиатуры
        int sum;
        int count = 0;

        // Переменная для хранения суммы всех продаж


        // Бесконечный цикл для ввода данных
        while (true) {
            // Запрашиваем сумму продажи
            System.out.println("Введите сумму продажи");
            // Считываем введенное число
            sum = scanner.nextInt();


            // Если введено отрицательное число, выходим из цикла
            if (sum < 0) {
                break;
            }
            count += sum;
            // Добавляем положительное число к общей сумме

        }
        System.out.println(count);
        // Выводим итоговую сумму всех продаж

    }
}