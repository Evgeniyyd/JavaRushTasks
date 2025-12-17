package ru.javarush.java.core.level10.task03;

public class Solution {
    public static void main(String[] args) {
        // Исходная цена товара (примитивный тип double)
        double productPrice = 3.14;
        Double wrappedPrice = productPrice;
        // Автоматическая упаковка (autoboxing) в объект типа-обёртки Double

        double finalCalculatedPrice = wrappedPrice;
        // Автоматическая распаковка (unboxing) обратно в примитивный тип double
        System.out.println(finalCalculatedPrice);

        // Вывод финального "разупакованного" значения на экран

    }
}