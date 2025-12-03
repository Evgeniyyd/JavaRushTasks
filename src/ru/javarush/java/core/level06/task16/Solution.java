package ru.javarush.java.core.level06.task16;

import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем сумму мировых продаж (в миллионах)
    double totalGlobalSales = 12345678.9012;
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String format = decimalFormat.format(totalGlobalSales);
        // Шаблон "#,##0.00" — добавляет разделители тысяч и ровно 2 знака после запятой
        System.out.println(format);

        // Форматируем и выводим результат на экран

    }
}