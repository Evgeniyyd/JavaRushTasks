package ru.javarush.java.core.level10.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Просим ввести два целых числа
        System.out.println("Введите первое целое число:");
        int a = console.nextInt();

        System.out.println("Введите второе целое число:");
        int b = console.nextInt();

        // Просим ввести символ операции
        System.out.println("Введите операцию (+, -, *, /):");
        char op = console.next().charAt(0); // Берем первый символ введенной строки

        int result = 0; // Здесь будем хранить результат вычисления
        switch (op) {
            case '+' -> result = a + b;

            case '*' -> result = a * b;

            case '/' -> result = a / b;

            case '-' -> result = a - b;

            default -> System.out.println("Неизвестная операция");

        }
        // Классический switch по символу операции


        // Выводим результат вычисления
        System.out.println(result);
    }
}