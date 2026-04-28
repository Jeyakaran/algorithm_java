package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestRepeatingCharacterReplacementTest {
    private final LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();

    @Test
    void characterReplacement() {
        int actual = longestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1);
        assertEquals(4, actual);
    }
}