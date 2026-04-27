package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReverseStringTest {

    private final ReverseString reverseString = new ReverseString();

    @Test
    void reverseString_typicalString() {
        assertEquals("olleh", reverseString.reverseString("hello"));
    }

    @Test
    void reverseString_emptyString() {
        assertEquals("", reverseString.reverseString(""));
    }

    @Test
    void reverseString_singleCharacter() {
        assertEquals("a", reverseString.reverseString("a"));
    }

    @Test
    void reverseString_palindrome() {
        assertEquals("racecar", reverseString.reverseString("racecar"));
    }

    @Test
    void reverseString_stringWithSpaces() {
        assertEquals("dlrow olleh", reverseString.reverseString("hello world"));
    }

    @Test
    void reverseString_nullInput() {
        assertThrows(NullPointerException.class, () -> reverseString.reverseString(null));
    }
}
