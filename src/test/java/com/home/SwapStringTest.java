package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapStringTest {
    private final SwapString swapString = new SwapString();

    @Test
    void minSwap() {
        String s1 = "abcd";
        String s2 = "cdab";
        int result = swapString.solution(s1, s2);
        assertEquals(4, result);
    }
}