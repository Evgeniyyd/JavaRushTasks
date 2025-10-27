package ru.javarush.java.core.level03.task14;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные согласно условию задачи
boolean ticketsOnSale =false;
boolean haveMoneyForTicket =true;
boolean concertNotCanceled =false;
boolean canBuy = ticketsOnSale || haveMoneyForTicket && concertNotCanceled;
boolean canBuyWithNewMeaning = (ticketsOnSale || haveMoneyForTicket) && concertNotCanceled;
        System.out.println(canBuy);
        System.out.println(canBuyWithNewMeaning);
        // Первое логическое выражение без дополнительных скобок


        // Второе логическое выражение с добавлением скобок


        // Выводим результаты обоих выражений на экран


    }
}