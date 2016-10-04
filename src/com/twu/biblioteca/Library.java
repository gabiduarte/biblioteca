package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public Library(List<Book> books) {
        this.books = books;
    }

    public String showBooks() {
        String listOfBooks = "No available books in Biblioteca";

        if (books.size() > 0) {
            listOfBooks = "Books Available:\n\n";

            for (Book book: books) {
                listOfBooks += book.showDetails() + "\n";
            }
        }

        return listOfBooks;
    }
}
