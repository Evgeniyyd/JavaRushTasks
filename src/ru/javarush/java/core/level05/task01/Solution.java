package ru.javarush.java.core.level05.task01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите высоту лестнице");
   int sum = scanner.nextInt();
        // Запрашиваем у пользователя высоту лестницы


        // Внешний цикл — по количеству ступеней (строк)
        for (int i =0; i < sum; i++) {
            // Внутренний цикл — печатает нужное количество символов '#'
            for (int j =0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
            // Переход на новую строку после каждой ступеньки

        }
    }
}