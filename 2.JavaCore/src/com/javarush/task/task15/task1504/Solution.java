package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        books.add(new Book("") {
            @Override
            public Book getBook() {
                return this;
            }

            @Override
            public String getTitle() {
                return "";
            }
        });
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            if (this instanceof AgathaChristieBook) {
                return agathaChristieOutput;
            }
            if (this instanceof MarkTwainBook) {
                return markTwainOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }

    }

    public static class MarkTwainBook extends Book {
        public String title;

        public MarkTwainBook(String title) {
            super("MarkTwain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book {
        public String title;

        public AgathaChristieBook(String title) {
            super(" AgathaChristie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}
