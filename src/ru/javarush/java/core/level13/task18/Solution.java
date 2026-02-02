package ru.javarush.java.core.level13.task18;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Текущая дата
        LocalDate today = LocalDate.now();
        LocalDate futureMilestone = LocalDate.of(2025, 1, 1);
        if (futureMilestone.isBefore(today)) {
            System.out.println("2025 уже наступил");
        }else {
            System.out.println("2025 еще не наступил");
        }
        // Контрольная дата: 1 января 2025 года

        // Используем isBefore: если futureMilestone раньше today, значит 2025 уже наступил

    }
}