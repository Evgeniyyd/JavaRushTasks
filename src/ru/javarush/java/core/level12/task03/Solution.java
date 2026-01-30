package ru.javarush.java.core.level12.task03;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список для хранения имен гостей
      List<String> list = new ArrayList<>();
list.add("Анна");
        list.add("Иван");
        list.add("Петр");
        list.add("Мария");
        // Добавляем имена в список
        boolean contains = list.contains("Петр");
        boolean contains1 = list.contains("Сергей");
        // Проверяем, содержится ли имя "Петр" в списке

        System.out.println(contains);
        System.out.println(contains1);
        // Проверяем, содержится ли имя "Сергей" в списке

    }
}