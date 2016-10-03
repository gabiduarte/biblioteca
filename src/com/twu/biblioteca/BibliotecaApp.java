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
        List<String> books = new ArrayList<String>();
        books.add("Harry Potter");
        books.add("TDD by Example");

        Library library = new Library(books);
        return library.showBooks();
    }
}
