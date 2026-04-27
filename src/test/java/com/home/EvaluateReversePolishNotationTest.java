package com.home;

import org.junit.jupiter.api.Test;

import static com.home.EvaluateReversePolishNotation.evaluateReversePolishNotation;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest {

    @Test
    void evaluate_addThenSubtract() {
        // (1 + 2) - 4 = -1
        assertEquals(-1, evaluateReversePolishNotation("1 2 + 4 -"));
    }

    @Test
    void evaluate_simpleAddition() {
        assertEquals(5, evaluateReversePolishNotation("2 3 +"));
    }

    @Test
    void evaluate_simpleSubtraction() {
        // 5 - 3 = 2
        assertEquals(2, evaluateReversePolishNotation("5 3 -"));
    }

    @Test
    void evaluate_singleNumber() {
        assertEquals(7, evaluateReversePolishNotation("7"));
    }

    @Test
    void evaluate_multipleOperations() {
        // (2 + 3) - 1 = 4
        assertEquals(4, evaluateReversePolishNotation("2 3 + 1 -"));
    }

    @Test
    void evaluate_simpleMultiplication() {
        // 3 * 4 = 12
        assertEquals(12, evaluateReversePolishNotation("3 4 *"));
    }

    @Test
    void evaluate_simpleDivision() {
        // 10 / 2 = 5
        assertEquals(5, evaluateReversePolishNotation("10 2 /"));
    }

    @Test
    void evaluate_mixedOperators() {
        // (2 * 3) + (10 / 2) = 11
        assertEquals(11, evaluateReversePolishNotation("2 3 * 10 2 / +"));
    }
}
