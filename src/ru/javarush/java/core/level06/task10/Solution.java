package ru.javarush.java.core.level06.task10;

public class Solution {
    public static void main(String[] args) {
        // Делим 1.0 на 0.0: в мире double это не ошибка, а положительная бесконечность
double i = 1.0;
double a = 0.0;
        double cosmicEvent = i / a;
        // Выводим значение переменной (ожидается "Infinity")
        System.out.println(cosmicEvent);
        System.out.println(Double.isInfinite(cosmicEvent));
        // Подтверждаем, что значение действительно бесконечность

    }
}