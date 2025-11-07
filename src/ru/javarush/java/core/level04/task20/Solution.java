package ru.javarush.java.core.level04.task20;

public class Solution {
    public static void main(String[] args) {
        // Внешний цикл перебирает значения i от 1 до 10

        for (int i = 1; i <= 10; i++) {
            // Внутренний цикл перебирает значения j от 1 до 10
            for (int j = 1; j <= 10; j++) {
                // Проверяем, равна ли сумма i и j числу 13
                if ((i + j) == 13) {
                    System.out.println("Пароль найден: i=" +i + ", j=" +j);
                    // Если сумма равна 13, выводим результат

                    // Завершаем оба цикла с помощью return
                    return;
                }
            }
        }
    }
}