package ru.javarush.java.core.level11.task07;

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println(50/0);
            // Пробуем поделить 50 на 0 — это вызовет ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // Выводим текстовое описание ошибки, сгенерированное JVM


        }
    }
}