package ru.javarush.java.core.level12.task08;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Исходный текст для анализа
        String textContent = "java core java map";
        // Создаем HashMap для хранения статистики слов
        HashMap<String, Integer> hashMap = new HashMap<>(textContent.length());
        int coll = 0;
        // Разбиваем текст на слова, используя пробел как разделитель
        String[] split = textContent.split(" ");
        // Подсчитываем количество вхождений каждого слова
        for (String s : split) {
            // Получаем значение из словаря
            hashMap.get(s);

            // Если слово уже есть в HashMap, увеличиваем его счетчик
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s)+1);
            }else
                hashMap.put(s,1);
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}

