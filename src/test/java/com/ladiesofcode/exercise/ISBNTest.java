package com.ladiesofcode.exercise;

import com.ladiesofcode.exercise.isbn.ISBN;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ISBNTest {

    private ISBN isbn;

    @Before
    public void setUp() {
        isbn = new ISBN();
    }

    @Test
    public void validISBN13() {
        assertTrue(isbn.validateISBN("9780470059029"));
    }

    @Test
    public void emptyISBN13() {
        assertFalse(isbn.validateISBN(""));
    }

}
