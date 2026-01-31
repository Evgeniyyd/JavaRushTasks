package ru.javarush.java.core.level13.task13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {

        // Получаем сегодняшнюю дату как LocalDate
        LocalDate currentReportDate = LocalDate.now();
        DateTimeFormatter isoLocalDate = DateTimeFormatter.ISO_LOCAL_DATE;
        // Форматируем дату в стандарт ISO_LOCAL_DATE (например, 2025-06-01)
        String formattedReportDate = currentReportDate.format(isoLocalDate);
        System.out.println(formattedReportDate);

        // Выводим отформатированную дату

    }
}