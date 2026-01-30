package ru.javarush.java.core.level13.task04;


import java.time.LocalDateTime;


public class Solution {
    public static void main(String[] args) {
        // LocalDateTime хранит одновременно дату и время
        LocalDateTime historicMoment = LocalDateTime.of(2022,3,20,10,0);
        // Фиксируем точный момент: 20 марта 2022 года, 10:00

        System.out.println(historicMoment);
        // Выводим зафиксированный момент на экран

    }
}