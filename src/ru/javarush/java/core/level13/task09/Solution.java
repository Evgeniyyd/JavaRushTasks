package ru.javarush.java.core.level13.task09;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущее время в каждой указанной зоне через ZonedDateTime.now(ZoneId.of(...))
        ZonedDateTime currentTimeInMinsk = ZonedDateTime.now(ZoneId.of("Europe/Minsk"));
        ZonedDateTime currentTimeInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York" ));
        ZonedDateTime currentTimeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Minsk: "+ currentTimeInMinsk.toLocalDateTime());
        System.out.println("New_York: "+ currentTimeInNewYork.toLocalDateTime());
        System.out.println("Tokyo: " + currentTimeInTokyo.toLocalDateTime());

        // Простой и наглядный формат даты и времени (локальное время конкретной зоны)


        // Выводим каждую зону на отдельной строке: название города + локальное время

    }
}