package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
    private final LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();


    @Test
    void example01() {
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, actual);
    }

    @Test
    void example02() {
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, actual);
    }

    @Test
    void example03() {
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, actual);
    }
}