package ru.javarush.java.core.level13.task14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Входная строка с датой в формате ISO (год-месяц-день)
        String inputDateString = "2024-12-31";
        String format = LocalDate.parse(inputDateString).format(DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate parse = LocalDate.parse(format);
        System.out.println(parse);
        // Парсим строку в объект LocalDate, явно указывая стандартный ISO форматтер


        // Выводим полученный объект даты на экран

    }
}