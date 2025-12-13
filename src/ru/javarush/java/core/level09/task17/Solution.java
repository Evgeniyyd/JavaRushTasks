package ru.javarush.java.core.level09.task17;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с начальным содержимым "Java"
        StringBuilder builder = new StringBuilder("Java");
        builder.append(" - это круто!");
        // Добавляем к строке нужную фразу с помощью метода append()

        System.out.println(builder);
        // Выводим итоговую строку на экран

    }
}