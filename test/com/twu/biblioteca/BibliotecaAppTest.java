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
