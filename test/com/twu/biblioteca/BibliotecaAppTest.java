package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void shouldWelcomeUserWhenStarting() throws Exception {
        BibliotecaApp app = new BibliotecaApp();
        assertEquals("Welcome to Biblioteca!", app.welcome());
    }

    @Test
    public void shouldReturnBookListGivenCorrectOptionOnMenu() throws Exception {
        BibliotecaApp app = new BibliotecaApp();
        assertEquals("Books Available:\n\n" +
                "Harry Potter - JK Rowling - 1998\n" +
                "TDD by Example - Kent Beck - 2003\n", app.menu("1"));
    }
}
