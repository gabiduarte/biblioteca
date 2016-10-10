package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    public String showBooks() {
        String listOfBooks = UIStrings.LIBRARY_BOOKS_UNAVAILABLE;

        if (books.size() > 0) {
            listOfBooks = UIStrings.LIBRARY_BOOKS_AVAILABLE;

            for (Book book: books) {
                if (book.isAvailable())
                    listOfBooks += book.showDetails() + UIStrings.LINE_BREAK;
            }
        }

        return listOfBooks;
    }

    public Book searchBook(int id) {
        for (Book book: books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public boolean checkout(Book book) {
        book.setAvailable(false);
        return !book.isAvailable();
    }

    public void createBookShelf() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Harry Potter", "JK Rowling", "1998"));
        books.add(new Book(2, "TDD by Example", "Kent Beck", "2003"));

        this.books = books;
    }
}
