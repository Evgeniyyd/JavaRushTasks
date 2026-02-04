package ru.javarush.java.core.level13.task19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Solution {
    public static void main(String[] args) {
        // Текущая дата (берется из системных настроек)
        LocalDate today = LocalDate.now();
        LocalDate projectDeadline = LocalDate.of(2025, 5, 15);
        // Дата дедлайна проекта: 15 мая 2025 года

        long daysRemaining = ChronoUnit.DAYS.between(today, projectDeadline);
        System.out.println(daysRemaining);
        // Количество дней между today и projectDeadline


        // Выводим результат на экран

    }
}