package ru.javarush.java.core.level14.task03;

public class Solution {
    public static class Book {
        String title;
        int pages;

        public void printInfo() {
            System.out.println("Название: " + title + ", страниц: " + pages);
        }
    }

    public static void main(String[] args) {
        // Создаем одну конкретную книгу
        Book book = new Book();
        book.pages = 350;
        book.title = "Java для начинающих";
        book.printInfo();
        // Просим книгу "рассказать о себе"

    }
}