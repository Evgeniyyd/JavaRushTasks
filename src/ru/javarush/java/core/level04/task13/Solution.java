package ru.javarush.java.core.level04.task13;

public class Solution {
    public static void main(String[] args) {
        // Перебираем числа от 1 до 10 включительно
        for (int sum = 1; sum <= 10; sum++) {
            // Проверяем, является ли текущее число верным кодом
            if (sum == 5) {
                System.out.println("Код найден! Замок открыт");
                // Если код найден, выводим сообщение

                // Прерываем цикл, так как код найден
                break;
            }
        }
    }
}