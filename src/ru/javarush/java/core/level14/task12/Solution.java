package ru.javarush.java.core.level14.task12;

public class Solution {
    public static void main(String[] args) {
        // "Регистрируем" книгу без начальных данных — сработает конструктор по умолчанию
        Book book = new Book();
        Book book1 = new Book("Java для начинающих", 350);
        System.out.println("Книга: " + book.getBookTitle() + ", страниц: " + book.getNumberOfPages());
        System.out.println("Книга: " + book1.getBookTitle() + ", страниц: " + book1.getNumberOfPages());

        // "Регистрируем" книгу с готовыми данными


        // Показываем информацию о каждой книге в требуемом формате

    }
}

