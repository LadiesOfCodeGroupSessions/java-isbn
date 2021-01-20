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

    @Test
    public void testIfIsbnContainsSpaces(){
        assertTrue(isbn.validateISBN("978 0 471 48648 0"));
    }

    @Test
    public void testIfIsbnIsAllDigit(){
        assertFalse(isbn.validateISBN("978a471486480"));
    }

    @Test
    public void testIfIsbnContainsIphone(){
        assertTrue(isbn.validateISBN("978-0596809485"));
    }

    @Test
    public void testIfIsbnContainsMoreThanOneIphone(){
        assertTrue(isbn.validateISBN("978-0-13-149505-0"));
    }

    @Test
    public void testIfIsbnContainsMoreThanOneIphone2(){
        assertTrue(isbn.validateISBN("978-0-262-13472-9"));
    }
}
