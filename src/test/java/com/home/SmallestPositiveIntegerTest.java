package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestPositiveIntegerTest {
    private final SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();

    @Test
    void solution() {
        int[] A = {1, 2, 3, 4, 5};
        int result = smallestPositiveInteger.solution(A);
        assertEquals(6, result);
    }
}