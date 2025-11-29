package ru.javarush.java.core.level05.task18;

public class Solution {
    public static void main(String[] args) {
        // Начинаем с числа 1
        int i = 1;

        // Используем цикл while для перебора чисел
        while (true) {
            // Проверяем, делится ли текущее число на 7 без остатка
            if (i % 7 == 0) {
                System.out.println("Первое число, кратное 7: " + i);
                // Если делится, выводим результат
                break;
                // Завершаем цикл с помощью break

            }
            i++;
            // Увеличиваем число на 1

        }
    }
}