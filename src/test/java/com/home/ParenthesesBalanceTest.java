package com.home;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesBalanceTest {

    @Test
    void isParenBalanced_allBracketTypes() {
        assertTrue(ParenthesesBalance.isParenBalanced("()[{}]"));
    }

    @Test
    void isParenBalanced_unclosedOpen() {
        assertFalse(ParenthesesBalance.isParenBalanced("([]()" ));
    }

    @Test
    void isParenBalanced_leadingClose() {
        assertFalse(ParenthesesBalance.isParenBalanced(")()[]{}" ));
    }

    @Test
    void isParenBalanced_interleavedMismatch() {
        assertFalse(ParenthesesBalance.isParenBalanced("([)]"));
    }

    @Test
    void isParenBalanced_mismatchedClose() {
        assertFalse(ParenthesesBalance.isParenBalanced("[{})"));
    }

    @Test
    void isParenBalanced_emptyString() {
        assertTrue(ParenthesesBalance.isParenBalanced(""));
    }

    @Test
    void isParenBalanced_null() {
        assertTrue(ParenthesesBalance.isParenBalanced(null));
    }

    @Test
    void isParenBalanced_nestedValid() {
        assertTrue(ParenthesesBalance.isParenBalanced("{[()]}"));
    }
}
