package ru.javarush.java.core.level06.task01;

public class Solution {
    public static void main(String[] args) {
        // Объявляем уровень персонажа (тип byte)
        byte characterLevel = 5;
        // Объявляем показатель брони (тип short)
        short armorRating = 98;
        // Объявляем накопленный опыт (тип int)
        int experiencePoints = 300;
        // Объявляем количество золотых монет (тип long)
        long goldCoins = 12345612;
        // Объявляем сопротивление магии (тип float)
        float magicResistance = 10.0f;
        // Объявляем шанс критического удара (тип double)
        double criticalHitChance = 0.5;

        // Выводим каждую характеристику героя на новой строке
        System.out.println("Уровень персонажа: " + characterLevel);
        System.out.println("Показатель брони: " + armorRating);
        System.out.println("Накопленный опыт: " + experiencePoints);
        System.out.println("Золотых монет: " + goldCoins);
        System.out.println("Сопротивление магии: " + magicResistance);
        System.out.println("Шанс критического удара: " + criticalHitChance);


    }
}