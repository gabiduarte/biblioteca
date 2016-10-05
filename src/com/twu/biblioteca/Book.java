package com.twu.biblioteca;


public class Book {
    private String name;
    private String author;
    private String year;
    private boolean isAvailable = true;

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String showDetails() {
        return this.name + " - " + this.author + " - " + this.year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
