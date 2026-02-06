package ru.javarush.java.core.level14.task13;

public class Solution {
    public static void main(String[] args) {
        // Регистрируем книгу, у которой пока есть только название
        // Регистрируем книгу с названием и количеством страниц
        Book book = new Book("Загадочный роман");
        Book book1 = new Book("Путешествие по космосу",500);

        System.out.println("Название книги : "+book.getBookTitle() +", страниц: "+ book.getPageCount());
        System.out.println("Название книги : "+book1.getBookTitle() +", страниц: "+ book1.getPageCount());
        // Выводим значения полей для обеих книг (по очереди: название, затем количество страниц)

    }
}

// "Форма" для книги: хранит название и количество страниц