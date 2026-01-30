package ru.javarush.java.core.level12.task02;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список строк (названия фруктов)
        List<String> fruits = new ArrayList<>();
        // Добавляем исходные фрукты в заданном порядке
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.set(1, "Груша");
        fruits.remove(0);
        for (String s : fruits) {
            System.out.println(s);
        }
    }
}