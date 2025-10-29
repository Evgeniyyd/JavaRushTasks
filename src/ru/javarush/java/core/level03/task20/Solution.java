package ru.javarush.java.core.level03.task20;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную возраста посетителя
        int visitorAge =45;
        String  ticketCategory  =(visitorAge < 7)? "Детский" : (visitorAge >=7 && visitorAge <=17) ?
            "Подростковый" : (visitorAge >= 18 && visitorAge <= 64) ? "Взрослый" : (visitorAge >= 65) ?  "Пенсионный" : "Взрослый";
        System.out.println(ticketCategory);
        // Используем вложенные тернарные операторы для определения категории билета


        // Выводим категорию билета на экран

    }
}