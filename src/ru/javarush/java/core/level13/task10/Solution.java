package ru.javarush.java.core.level13.task10;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // 1. Создаем "локальное" время без привязки к часовой зоне:
        // 1 июня 2025 года, 14:00
            LocalDateTime conferenceStartLocal = LocalDateTime.of(2025,6,1,14,0);
ZoneId zoneId = ZoneId.of("Europe/Minsk");
        // 2. Выбираем часовую зону Europe/Minsk
       ZonedDateTime conferenceStartMinskZoned = conferenceStartLocal.atZone(zoneId);
        System.out.println(conferenceStartMinskZoned);

        // 3. Привязываем локальное время к выбранной зоне, получаем ZonedDateTime


        // 4. Выводим результат для проверки (например: 2025-06-01T14:00+03:00[Europe/Minsk])

    }
}