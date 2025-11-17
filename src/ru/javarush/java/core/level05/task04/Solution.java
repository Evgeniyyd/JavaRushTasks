package ru.javarush.java.core.level05.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
         Scanner scanner = new Scanner(System.in);
        // Запрашиваем у пользователя ввод числа N (magicLimit)
        int n =1;
        int magicLimit = scanner.nextInt();
        // Вычисляем и выводим квадрат каждого числа от 1 до N
        for (int i = n; i <= magicLimit; i++) {
            System.out.println(i * i);
        }
    }
}