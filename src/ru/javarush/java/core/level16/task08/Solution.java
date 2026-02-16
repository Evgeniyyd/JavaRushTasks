package ru.javarush.java.core.level16.task08;


public class Solution {
    public static class Book {
        private String bookTitle;
        private int pageCount;

     private  Book(Builder builder) {
            this.bookTitle = builder.bookTitle;
            this.pageCount = builder.pageCount;
        }

        @Override
        public String toString() {
            return "Book: " + bookTitle +","
                    + pageCount+
                    " pages.";
        }

        public static class Builder {
            private String bookTitle;
            private int pageCount;


            public Builder setTitle(String title) {
                this.bookTitle = title;
                return this;
            }

            public Builder setPages(int pages) {
                this.pageCount = pages;
                return this;
            }

            public Book build() {
               return new Book(this);
            }
        }
    }

    public static void main(String[] args) {
        // Создаем книгу через статический вложенный класс Builder
        Book book = new Book.Builder()
                .setTitle("Java Basics")
                .setPages(500)
                .build();

        // Выводим информацию о книге (toString() возвращает строку в нужном формате)
        System.out.println(book);
    }
}