package ru.javarush.java.core.level11.task01;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные согласно условию
int totalEnergy =100;
int divisor =0;
    try {
        System.out.println(totalEnergy/divisor);
    } catch (Exception e) {
        throw new ArithmeticException("");
    }
        // Попытка выполнить деление на ноль.
        // В момент вычисления этой строки произойдет ArithmeticException: / by zero


        // Попытка вывести результат деления (до этой строки выполнение не дойдет из-за исключения выше)

    }
}