package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<String>();

    public Library(List<String> books) {
        this.books = books;
    }

    public String showBooks() {
        String listOfBooks = "No available books in Biblioteca";

        if (books.size() > 0) {
            listOfBooks = "Books Available:\n\n";

            for (String book: books) {
                listOfBooks += book + "\n";
            }
        }

        return listOfBooks;
    }
}
