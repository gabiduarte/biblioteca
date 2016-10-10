package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
                "1 - Harry Potter - JK Rowling - 1998\n" +
                "2 - TDD by Example - Kent Beck - 2003\n", app.menu("1"));
    }

    @Test
    public void shouldReturnNullGivenIncorrectOptionOnMenu() throws Exception {
        BibliotecaApp app = new BibliotecaApp();
        assertNull(app.menu("AAA"));
    }

    @Test
    public void shouldReturnGoodbyeMessageGivenQuitOption() throws Exception {
        BibliotecaApp app = new BibliotecaApp();
        assertEquals("Thanks for using Biblioteca!", app.menu("9"));
    }
}
