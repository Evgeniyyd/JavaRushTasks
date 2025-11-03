package ru.javarush.java.core.level04.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с консоли
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i;
        // Сумма всех введенных стоимостей
        System.out.println("Ведите  первую стоимость чашки кофе");
        // Запрашиваем первую стоимость чашки кофе
        // Используем цикл while для продолжения ввода до тех пор, пока не будет введено отрицательное число
        while (true) {
            i = scanner.nextInt();
            if (i < 0) {
                break;
            } else {
                // Добавляем введенную стоимость к общей сумме
                sum += i;
                System.out.println("Ведите следующую стоимость");
                // Запрашиваем следующую стоимость
            }
            // Выводим итоговую сумму расходов на кофе (отрицательное значение в сумму не входит)
        }
        System.out.println(sum);
    }
}