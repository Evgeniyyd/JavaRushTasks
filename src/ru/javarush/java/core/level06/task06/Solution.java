package ru.javarush.java.core.level06.task06;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму платижа: ");
        double customerPayment = scanner.nextDouble();



        // Просим пользователя ввести сумму платежа
        System.out.println("Внесено средств: " + customerPayment);

        // Считываем введенное значение и сохраняем его в переменную типа double


        // Подтверждаем полученную сумму, выводя её на экран

    }
}