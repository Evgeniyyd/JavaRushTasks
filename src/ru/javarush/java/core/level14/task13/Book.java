package ru.javarush.java.core.level14.task13;

public class Book {
    private String bookTitle;
    private  int pageCount;

    public Book(String bookTitle, int pageCount) {
        this.bookTitle = bookTitle;
        this.pageCount = pageCount;
    }

    public Book(String bookTitle) {
        this.pageCount =0;
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPageCount() {
        return pageCount;
    }
}
