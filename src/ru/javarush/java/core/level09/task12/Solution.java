package ru.javarush.java.core.level09.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner console = new Scanner(System.in);

        // Запрашиваем у пользователя ввод названия продукта
        System.out.println("Введите название продукта:");
        String productName = console.nextLine();
        if (productName.startsWith(String.valueOf('E'))){
            String substring = productName.substring(0, 3);
            System.out.println(substring);
        }else {
            System.out.println("Первая буква не E");
        }
        // Проверяем, начинается ли название с буквы 'E'

            // Извлекаем первые три символа строки

            // Выводим аббревиатуру на экран


            // Выводим сообщение, если первая буква не 'E'

    }
}