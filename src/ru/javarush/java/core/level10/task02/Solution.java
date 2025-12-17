package ru.javarush.java.core.level10.task02;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа char и присваиваем ей символ '7'
        char ch = '7';
        boolean charCount = Character.isDigit(ch);
        // Используем класс-обёртку Character для проверки, является ли символ цифрой
        System.out.println(charCount);

        // Выводим результат проверки на экран

    }
}