package com.twu.biblioteca;


public class Book {
    private String name;
    private String author;
    private String year;

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String showDetails() {
        return this.name + " - " + this.author + " - " + this.year;
    }
}
