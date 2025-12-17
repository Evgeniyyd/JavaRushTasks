package ru.javarush.java.core.level10.task14;

// Перечисление с четырьмя временами года


public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа Season и присваиваем ей значение SUMMER
        Season summer = Season.SUMMER;
        switch (summer){
            case AUTUMN -> System.out.println("Осень - Золотая пора!");
            case SPRING -> System.out.println("Весна - Первый подснежник!");
            case WINTER -> System.out.println("Зима - Доставать лыжи");
            case SUMMER -> System.out.println("Лето — время отпусков!");
        }

        // Для каждого сезона выводим свое жизнерадостное сообщение

    }
    enum Season{
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
    }
}