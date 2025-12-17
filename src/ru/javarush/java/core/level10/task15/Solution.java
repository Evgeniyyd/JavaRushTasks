package ru.javarush.java.core.level10.task15;

// Перечисление дней недели: каждое значение — отдельный день.


public class Solution {
    public static void main(String[] args) {

        for (DayOfWeek s: DayOfWeek.values()){
            System.out.println(s);
        }
        // Используем цикл for-each для перебора всех значений перечисления DayOfWeek

    }
    enum DayOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}