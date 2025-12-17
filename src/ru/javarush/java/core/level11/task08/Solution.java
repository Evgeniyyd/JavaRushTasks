package ru.javarush.java.core.level11.task08;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные primaryValue и secondaryValue
      int primaryValue =10;
      int secondaryValue =0;

        try {
            System.out.println(primaryValue / secondaryValue);
            // Пытаемся выполнить деление primaryValue на secondaryValue


        } catch (ArithmeticException e) {
            System.out.println( "Ошибка деления. Продолжаем работу системы.");
            // Обрабатываем исключение деления на ноль


        }
        System.out.println("Миссия завершена. Программа завершена.");

        // Выводим финальное сообщение, подтверждающее завершение программы

    }
}