package ru.javarush.java.core.level04.task06;

public class Solution {
    public static void main(String[] args) {
        // Используем цикл for для перебора чисел от 0 до 10 включительно
        for (int i =0; i<=10; i++) {
            // Проверяем, является ли текущее число чётным
            if (i%2==0) {
                System.out.println(i);
                // Если число чётное, выводим его на экран
            }
        }
    }
}