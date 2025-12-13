package ru.javarush.java.core.level09.task05;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две переменные и присваиваем им любые значения
        String userName = "Анна";
        int userAge = 25;
        String format =  String.format("Имя: %s, возраст: %d лет.", userName, userAge);
        // Формируем итоговую строку через String.format
        // %s — подстановка строки, %d — подстановка целого числа
        System.out.println(format);

        // Выводим результат на экран
        
    }
}