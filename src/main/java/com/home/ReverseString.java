package com.home;

import java.util.Stack;

public class ReverseString {
    public String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray())
            stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
