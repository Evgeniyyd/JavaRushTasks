package ru.javarush.java.core.level06.task09;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную mixtureResult и присваиваем ей результат сложения 0.1 + 0.2
      double mixtureResult = 0.1 + 0.2;

        // Объявляем переменную expectedConcentration и присваиваем ей значение 0.3
   double expectedConcentration =0.3;

        // Сравниваем значения переменных mixtureResult и expectedConcentration с помощью оператора ==
        boolean expectedConcentration1 = mixtureResult == expectedConcentration;

        System.out.println(expectedConcentration1);
        // Выводим результат сравнения на экран

    }
}