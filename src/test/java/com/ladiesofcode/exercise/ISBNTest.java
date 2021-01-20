package com.ladiesofcode.exercise;

import com.ladiesofcode.exercise.isbn.ISBN;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    public void testIfIsbnContainsSpaces() {
        assertTrue(isbn.validateISBN("97804 70059 029"));
    }

    @Test
    public void testIfIsbnIsAllDigit() {
        assertFalse(isbn.validateISBN("978a471486480"));
    }

    @Test
    public void testIfIsbnContainsIphone() {
        assertTrue(isbn.validateISBN("978-0596809485"));
    }

    @Test
    public void testIfIsbnContainsMoreThanOneIphone() {
        assertTrue(isbn.validateISBN("9-7804-7005-9029"));
    }

    @Test
    public void testIfIsbnContainsMoreThanOneIphone2() {
        assertTrue(isbn.validateISBN("978-0-262-13472-9"));
    }

    @Test
    public void testIfCheckedDigitIsCorrect() {
        assertEquals(9, isbn.checkDigit("9780470059029"));
    }
//
//    @Test
//    public void testValidateIfCheckedDigitIsCorrect() {
//        assertTrue(isbn.validateISBN("9780470059029"));
//    }
}
