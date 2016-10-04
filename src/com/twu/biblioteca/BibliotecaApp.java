package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();

        System.out.println(app.welcome());
        System.out.println(app.showLibraryBooks());
    }

    public String welcome() {
        return "Welcome to Biblioteca!";
    }

    public String showLibraryBooks() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "JK Rowling", "1998"));
        books.add(new Book("TDD by Example", "Kent Beck", "2003"));

        Library library = new Library(books);
        return library.showBooks();
    }
}
