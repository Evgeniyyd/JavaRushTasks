package ru.javarush.java.core.level13.task12;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // 1) Создаем ZonedDateTime для 1 июня 2025 года, 12:00 в зоне Europe/Minsk
ZonedDateTime originalEventTime = ZonedDateTime.of(2025,6,1, 12,0,0, 0, ZoneId.of("Europe/Minsk"));
        Instant universalInstant = originalEventTime.toInstant();
        // 2) Преобразуем ZonedDateTime в абсолютное мгновение Instant (UTC, часовой пояс не влияет)

        ZoneId eventTimeTokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime eventTimeTokyoZoned = originalEventTime.withZoneSameInstant(eventTimeTokyoZone);
        // 3) Тот же самый Instant отображаем как локальное время для зоны Asia/Tokyo


        System.out.println(originalEventTime);
        System.out.println(universalInstant);
        System.out.println(eventTimeTokyoZoned);
        // 4) Выводим все три значения

    }
}