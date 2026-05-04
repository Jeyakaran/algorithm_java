package com.home.jp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringsAlternatelyTest {
    private final MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();

    @Test
    void mergeAlternately() {
        assertEquals("apbqcr", mergeStringsAlternately.mergeAlternately("abc", "pqr"));
    }

    @Test
    void mergeAlternately2() {
        assertEquals("apbqrs", mergeStringsAlternately.mergeAlternately("ab", "pqrs"));
    }
}
