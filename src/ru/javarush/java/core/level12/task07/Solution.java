package ru.javarush.java.core.level12.task07;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем словарь: ключ — Integer (ID пользователя), значение — String (имя)
        HashMap<Integer,String> userRegistry = new HashMap<>();
        // Добавляем двух пользователей
      userRegistry.put(1,"Иван");
      userRegistry.put(2,"Мария");
      userRegistry.remove(1);

        // Удаляем пользователя с ключом 1
        System.out.println( userRegistry.get(1));

        // Пытаемся получить значение по ключу 1 после удаления


        // Ожидается вывод null (пользователь "Иван" удален)

    }
}