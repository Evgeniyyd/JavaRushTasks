package ru.javarush.java.core.level05.task03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите послание");
        // Просим пользователя ввести строку (послание)
        String magicMessage = scanner.nextLine();
        String str = "";
        // Разворачиваем строку с помощью цикла for
        for (int i = magicMessage.length() - 1; i >= 0; i--) {
            str = str + magicMessage.charAt(i);
        }

        System.out.println(str);
        // Выводим инвертированную строку

    }
}