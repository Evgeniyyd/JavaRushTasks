package ru.javarush.java.core.level12.task05;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем ассоциативный массив (HashMap) для хранения переводов слов
HashMap<String,String> travelPhrasebook = new HashMap<>();
travelPhrasebook.put("дом","house");
        // Добавляем в словарь перевод: ключ "дом", значение "house"
        System.out.println(travelPhrasebook.get("дом"));

        // Получаем перевод слова "дом" из словаря


        // Выводим перевод на экран

    }
}