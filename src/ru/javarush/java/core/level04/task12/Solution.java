package ru.javarush.java.core.level04.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения пароля с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // переменная для введенного пароля
        String code;

        // Цикл do-while гарантирует минимум один запрос пароля
        do {
            System.out.println("Введите пороль");
            // Запрашиваем ввод пароля
            code = scanner.nextLine();

            // читаем строку целиком

        } while (code.length() < 6);
        // повторяем, пока пароль короче 6 символов
        System.out.println("Пароль надёжен, аккаунт создан!");
        // Сообщение об успешной регистрации

    }
}