package ru.javarush.java.core.level04.task01;

public class Solution {
    public static void main(String[] args) {
        // Инициализируем переменную для обратного отсчета

        int count = 3;
        // Цикл while выполняется, пока значение countdown больше 0
        while (count > 0) {
            System.out.println(count--);
        }
        System.out.println("Старт!");
    }
}