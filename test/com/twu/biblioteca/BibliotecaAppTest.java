package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void shouldWelcomeUserWhenStarting() throws Exception {
        BibliotecaApp app = new BibliotecaApp();
        assertEquals("Welcome to Biblioteca!", app.welcome());
    }
}
