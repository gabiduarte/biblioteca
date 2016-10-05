package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public Library(List<Book> books) {
        this.books = books;
    }

    public String showBooks() {
        String listOfBooks = UIStrings.LIBRARY_BOOKS_UNAVAILABLE;

        if (books.size() > 0) {
            listOfBooks = UIStrings.LIBRARY_BOOKS_AVAILABLE;

            for (Book book: books) {
                listOfBooks += book.showDetails() + UIStrings.LINE_BREAK;
            }
        }

        return listOfBooks;
    }
}
