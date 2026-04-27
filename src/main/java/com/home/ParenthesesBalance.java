package com.home;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesesBalance {
    public static boolean isParenBalanced(String parenString) {
        if (parenString == null || parenString.isEmpty())
            return true;

        Map<Character, Character> parenMap = new HashMap<>();
        parenMap.put('(', ')');
        parenMap.put('[', ']');
        parenMap.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (char c : parenString.toCharArray()) {
            if (parenMap.containsKey(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || parenMap.get(stack.pop()) != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
