package ru.javarush.java.core.level09.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две строковые переменные с начальными значениями
        String first = "apple";
        String second = "banana";
        int compareTo = first.compareTo(second);
        System.out.println(compareTo);
        String temp = first;
       first = second;
        second = temp;
        int compare = first.compareTo(second);
        System.out.println(compare);


        // Меняем значения переменных местами


        // Повторяем сравнение после обмена

    }
}