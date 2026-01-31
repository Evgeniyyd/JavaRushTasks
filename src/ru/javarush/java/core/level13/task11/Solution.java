package ru.javarush.java.core.level13.task11;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // Локальная дата-время телепорта (без привязки к часовому поясу)
    LocalDateTime teleportScheduledLocal = LocalDateTime.of(2025,6,1,18,0);
        ZoneId teleportTimeMinskZone = ZoneId.of("Europe/Minsk");
        ZoneId teleportTimeNewYorkZone = ZoneId.of("America/New_York");
        // Часовой  пояс Минска

        // Привязываем локальное время к Минску — получаем конкретное мгновение
        ZonedDateTime teleportTimeMinskZoned= teleportScheduledLocal.atZone(teleportTimeMinskZone);
        ZonedDateTime teleportTimeNewYorkZoned = teleportTimeMinskZoned.withZoneSameInstant(teleportTimeNewYorkZone);
        // Переводим то же самое мгновение в часовой пояс Нью-Йорка


        System.out.println(teleportTimeMinskZoned);
        System.out.println(teleportTimeNewYorkZoned);


        // Выводим оба значения, чтобы увидеть разницу представлений одного мгновения

    }
}