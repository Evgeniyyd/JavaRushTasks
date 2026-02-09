package ru.javarush.java.core.level13.task20;

import java.time.LocalDate;
import java.time.Period;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект LocalDate для даты постройки здания: 20 марта 2000 года
        LocalDate localDate = LocalDate.of(2000, 3, 20);
        // Получаем текущую дату
        LocalDate now = LocalDate.now();

        Period period = Period.between(localDate, now);
        int days = period.getDays();
        int years = period.getYears();
        int months = period.getMonths();

        System.out.println("Возраст: " + years+ " лет, "+ months + " месяцев, " +days+" дней");
        // Вычисляем полный период между датой постройки и сегодняшним днем


        // Форматируем и выводим результат в формате "Возраст: X лет, Y месяцев, Z дней"

    }
}