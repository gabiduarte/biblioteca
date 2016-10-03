package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void shouldShowBookDetails() throws Exception {
        Book book = new Book("TDD By Example", "Kent Beck", "2003");

        assertEquals("TDD By Example - Kent Beck - 2003", book.showDetails());
    }
}
