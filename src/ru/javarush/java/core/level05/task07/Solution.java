package ru.javarush.java.core.level05.task07;


import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с консоли
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInteger = new BigInteger(scanner.nextLine());
        int length = bigInteger.abs().toString().length();
        System.out.println(length);
        // Считываем большое число, введенное пользователем


        // Выводим количество цифр в числе

    }
}