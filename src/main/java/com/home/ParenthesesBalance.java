package com.home;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class ParenthesesBalance {

    private static final Map<Character, Character> PAIRS = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
    );

    public static boolean isParenBalanced(String parenString) {
        if (parenString == null || parenString.isEmpty())
            return true;

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : parenString.toCharArray()) {
            if (PAIRS.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != PAIRS.get(c))
                    return false;
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
