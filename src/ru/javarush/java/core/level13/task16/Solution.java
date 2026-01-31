package ru.javarush.java.core.level13.task16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Исходная строка с меткой времени заказа
        LocalDateTime orderTimestampString = LocalDateTime.of(2025, 6, 1, 14, 0);

        // Создаем форматтер с шаблоном "dd.MM.yyyy HH:mm"
        String parsedOrderDateTime = orderTimestampString.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
        // Парсим строку в объект LocalDateTime
        LocalDateTime parse = LocalDateTime.parse(parsedOrderDateTime);

        System.out.println(parse);

        // Выводим результат в стандартном ISO-формате (например, 2025-06-01T14:30)

    }
}