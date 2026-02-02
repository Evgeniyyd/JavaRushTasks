package ru.javarush.java.core.level13.task17;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Получаем сегодняшнюю дату
        LocalDate today = LocalDate.now();

        LocalDate holidayCountdownStart = today.plusDays(10);
        // Прибавляем к ней 10 дней, чтобы узнать дату начала обратного отсчета
        System.out.println(holidayCountdownStart);

        // Выводим результат на экран

    }
}