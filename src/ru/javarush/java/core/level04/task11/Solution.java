package ru.javarush.java.core.level04.task11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения ввода пользователя
Scanner scanner = new Scanner(System.in);

        // переменная для хранения выбранного пункта меню
String point;

        // Используем do-while, чтобы меню показывалось хотя бы один раз и повторялось до выбора "Выйти"
        do {
            System.out.println("Меню:");
            System.out.println("1. Вывести приветствие");
            System.out.println("2. Выйти");
            // Печатаем меню в каждом цикле
                    point = scanner.nextLine();
            // Считываем номер выбранного пункта


            // Обработка выбора
            if (point.equals("1")) {
                System.out.println("Привет!");
            }else if (point.equals("2")){
                break;
            }


            // При выборе 2 цикл завершится благодаря условию while ниже
            // Для других значений просто снова покажем меню

        } while (true);


    }
}