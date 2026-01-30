package ru.javarush.java.core.level13.task07;

import java.time.LocalTime;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта времени: утренняя встреча и дневная презентация
        LocalTime morningMeeting =LocalTime.of(8,00);
        LocalTime afternoonPresentation = LocalTime.of(14,30);
        if (morningMeeting.isBefore(afternoonPresentation)){
            System.out.println("8:00 раньше 14:30");
        }else
            System.out.println("8:00 не раньше 14:30");

        // Сравниваем времена с помощью специализированного метода isBefore

    }
}