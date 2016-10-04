package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private List<Book> books = new ArrayList<Book>();

    @Before
    public void setUp() {
        books.add(new Book("Book 1", "Author 1", "1999"));
        books.add(new Book("Book 2", "Author 2", "2000"));
    }

    @Test
    public void shouldShowListOfBookNames() throws Exception {
        Library library = new Library(books);
        assertEquals("Books Available:\n\nBook 1 - Author 1 - 1999\nBook 2 - Author 2 - 2000\n", library.showBooks());
    }

    @Test
    public void shouldShowNoBookMessageWhenListOfBooksIsEmpty() throws Exception {
        List<Book> emptyBookList = new ArrayList<Book>();
        Library library = new Library(emptyBookList);
        assertEquals("No available books in Biblioteca", library.showBooks());
    }
}
