package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterStringTest {
    private final FirstUniqueCharacterString firstUniqueCharacterString = new FirstUniqueCharacterString();

    @Test
    void firstUniqChar() {
        String s = "loveleetcode";
        int result = firstUniqueCharacterString.firstUniqChar(s);
        assertEquals(2, result);
    }
}