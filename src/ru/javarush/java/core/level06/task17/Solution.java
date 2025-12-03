package ru.javarush.java.core.level06.task17;

public class Solution {
    public static void main(String[] args) {
        // Общая масса материала в килограммах
        double totalMaterialWeight = 7.89;
        int completeItemsCount =(int) totalMaterialWeight;
        System.out.println(completeItemsCount);

        // Явно приводим double к int — дробная часть отбрасывается
        // Выводим количество целых предметов

    }
}