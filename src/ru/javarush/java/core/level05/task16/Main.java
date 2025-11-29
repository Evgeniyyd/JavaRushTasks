package ru.javarush.java.core.level05.task16;

// Импортируем класс java.util.Date
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создаем объект java.util.Date и присваиваем ему текущую дату и время
       java.util.Date date = new java.util.Date();
        System.out.println(date);

        java.sql.Date date1 = new java.sql.Date(System.currentTimeMillis());
        System.out.println(date1);

        // Создаем объект java.sql.Date, используя полное имя класса, и присваиваем ему текущую дату


        // Выводим оба объекта на консоль

    }
}