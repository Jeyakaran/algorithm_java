package com.home;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseString {
    public String reverseString(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : input.toCharArray())
            stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
