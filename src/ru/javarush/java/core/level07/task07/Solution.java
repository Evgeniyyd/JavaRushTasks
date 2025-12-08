package ru.javarush.java.core.level07.task07;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив с быстрой инициализацией
        int[] itemPrices = new int[]{5,7,2,9};
      int count =0;
        // Переменная для хранения суммы

        for (int i = 0; i < itemPrices.length; i++) {
            // Суммируем все элементы массива
            count += itemPrices[i];

            // Выводим итоговую сумму на экран
        }
        System.out.println(count);
    }
}