package ru.javarush.java.core.level04.task02;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = ""; // будем хранить введённый пользователем текст
        // Запрашиваем пароль, пока пользователь не введёт точное слово "java"
        while (true) {
            String string = console.nextLine();
            if (string.equals("java")) {
                System.out.println(input);
                System.out.println("Смартфон разблокирован!");
                break;
            }
        }


    }
}