package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    @Test
    public void shouldShowBookDetails() throws Exception {
        Book book = new Book(2, "TDD By Example", "Kent Beck", "2003");

        assertEquals("2 - TDD By Example - Kent Beck - 2003", book.showDetails());
    }
}
