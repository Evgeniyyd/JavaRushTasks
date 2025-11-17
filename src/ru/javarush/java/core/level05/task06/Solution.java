package ru.javarush.java.core.level05.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строки с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        // Проверяем палиндром двумя указателями: с начала и с конца
        boolean isPalindrom = true;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                isPalindrom =false;
                // Проверка чувствительна к регистру, сравниваем символы напрямую
                // Вывод строго "YES" или "NO" без дополнительных сообщений
            }
        }
        System.out.println((isPalindrom) ? "YES" : "NO");
    }
}

