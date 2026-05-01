package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxNumberOfWordsTest {
    private final MaxNumberOfWords maxNumberOfWords = new MaxNumberOfWords();

    @Test
    void maxNumberOfWords() {
        String paragraph = "This is a test. This is only a test. Testing, testing, 1, 2, 3.";
        int result = maxNumberOfWords.maxNumberOfWords(paragraph);
        assertEquals(5, result);
    }
}