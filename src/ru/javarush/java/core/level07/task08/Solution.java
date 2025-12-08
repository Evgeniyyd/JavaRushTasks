package ru.javarush.java.core.level07.task08;

public class Solution {
    public static void main(String[] args) {
        // Быстрая инициализация массива с 6 элементами температур
   int[] hourlyTemperatures = new int[]{3,11,7,4,15,2};
        // Предполагаем, что первый элемент массива является максимальным
        int max = hourlyTemperatures[0];
        // Проходим по всем элементам массива, начиная со второго
        for (int i = 1; i < hourlyTemperatures.length; i++) {
            if (hourlyTemperatures[i] > max){
                max= hourlyTemperatures[i];
            }

        }
        System.out.println(max);


        // Если текущая температура больше сохранённой максимальной

        // Обновляем максимальную температуру



        // Выводим найденную максимальную температуру

    }
}