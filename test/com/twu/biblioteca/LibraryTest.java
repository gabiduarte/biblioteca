package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private List<String> books = new ArrayList<String>();

    @Before
    public void setUp() {
        books.add("Book 1");
        books.add("Book 2");
    }

    @Test
    public void shouldShowListOfBookNames() throws Exception {
        Library library = new Library(books);
        assertEquals("Books Available:\n\nBook 1\nBook 2\n", library.showBooks());
    }

    @Test
    public void shouldShowNoBookMessageWhenListOfBooksIsEmpty() throws Exception {
        List<String> emptyBookList = new ArrayList<String>();
        Library library = new Library(emptyBookList);
        assertEquals("No available books in Biblioteca", library.showBooks());
    }
}
