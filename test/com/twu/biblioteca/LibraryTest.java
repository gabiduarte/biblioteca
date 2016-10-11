package com.twu.biblioteca;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    public static Library library = new Library();

    @Before
    public void setUp() {
        library.createBookShelf();
    }

    @Test
    public void shouldShowListOfBookNames() throws Exception {
        String bookList = library.showBooks();
        assertThat(bookList, CoreMatchers.containsString("Harry Potter - JK Rowling - 1998"));
        assertThat(bookList, CoreMatchers.containsString("TDD by Example - Kent Beck - 2003"));
    }

    @Test
    public void shouldShowNoBookMessageWhenListOfBooksIsEmpty() throws Exception {
        library = new Library();
        assertEquals("No available books in Biblioteca", library.showBooks());
    }

    @Test
    public void shouldCheckoutAvailableBook() throws Exception {
        Book newBook = new Book(1, "Book 1", "Author 1", "1999");

        assertTrue(newBook.isAvailable());
        library.checkout(newBook);
        assertFalse(newBook.isAvailable());
    }

    @Test
    public void shouldNotShowUnavailableBooksInBookList() throws Exception {
        Book searchedBook = library.searchBook(2);
        library.checkout(searchedBook);
        String bookList = library.showBooks();
        assertFalse(bookList.contains(searchedBook.getName()));
    }

    @Test
    public void shouldFindBookWhenSearchingWithValidID() throws Exception {
        Book book = library.searchBook(1);
        assertEquals("Harry Potter", book.getName());
    }

    @Test
    public void shouldReturnSuccessMessageWhenCheckingOutAvailableBook() throws Exception {
        assertEquals("Thank you! Enjoy the book", library.checkout(new Book(1, "", "", "")));
    }

    @Test
    public void shouldReturnFailedMessageWhenCheckingOutUnavailableBook() throws Exception {
        Book unavailableBook = new Book(1, "", "", "");
        unavailableBook.setAvailable(false);
        assertEquals("That book is not available.", library.checkout(unavailableBook));
    }

    @Test
    public void shouldCheckinUnavailableBook() throws Exception {
        Book unavailableBook = new Book(1, "", "", "");
        unavailableBook.setAvailable(false);
        assertFalse(unavailableBook.isAvailable());
        library.checkin(unavailableBook);
        assertTrue(unavailableBook.isAvailable());
    }

}
