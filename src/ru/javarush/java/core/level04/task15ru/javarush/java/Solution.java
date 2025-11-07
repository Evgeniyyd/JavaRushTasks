package ru.javarush.java.core.level04.task15ru.javarush.java;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввести целое число больше 1");
        // Просим пользователя ввести целое число больше 1
        int n;
        n = scanner.nextInt();
        Boolean b = false;
        // Проверяем, является ли число простым
        // Цикл для поиска первого делителя числа n
        for (int sum = 2; sum <= n - 1; sum++) {
            if (n % sum == 0) {// Если n делится на i без остатка
                System.out.println(sum);
                // Выводим первый найденный делитель
                b = true;
                System.out.println("Число не простое");
                // Устанавливаем флаг, что число не простое
                // Завершаем цикл, так как делитель найден
                break;
            }
        }
        if (!b)
            System.out.println("Число простое");
    }
    // Если делитель не найден, выводим, что число простое

}
