package com.twu.biblioteca;


public class Book {
    private int id;
    private String name;
    private String author;
    private String year;
    private boolean isAvailable = true;

    public Book(int id, String name, String author, String year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String showDetails() {
        return this.id + " - " + this.name + " - " + this.author + " - " + this.year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return this.id;
    }


    public String getName() {
        return name;
    }
}
