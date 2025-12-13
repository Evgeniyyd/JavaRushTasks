package ru.javarush.java.core.level09.task08;

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные
        String studentName = "Анна"; // Имя студента
        int correctAnswers = 45; // Количество правильных ответов
        int totalQuestions = 50; // Общее количество вопросов
        double summ = (correctAnswers * 100.0) / totalQuestions;
        String format = String.format(Locale.GERMANY, " %s: %.1f%% правильных ответов.", studentName, summ);
        System.out.println(format);
        // Вычисляем процент правильных ответов


        // Форматируем строку с использованием Locale.GERMANY


        // Выводим результат на экран

    }
}