package ru.javarush.java.core.level03.task11;

public class Solution {
    public static void main(String[] args) {
        // Исходные условия (можно менять для проверки разных вариантов)
        boolean isSunny = false;
        boolean isWeekend = false;
        boolean canGoToPark = isSunny && isWeekend;
        boolean canStayHome = !isSunny || !isWeekend;
        System.out.println(canGoToPark);
        System.out.println(canStayHome);
    }
}


// В парк идём только если одновременно солнечно И выходные


// Остаёмся дома, если НЕ солнечно ИЛИ НЕ выходные


// Вывод значений на экран



