package ru.javarush.java.core.level11.task18;

public class Solution {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        // Объявляем массив playerInventory размером 3 элемента

            int[] playerInventory = new int[]{2,5,3};
            System.out.println(playerInventory[5]);


        // Пытаемся вывести элемент массива с индексом 5
        // Это вызовет исключение ArrayIndexOutOfBoundsException

    }
}