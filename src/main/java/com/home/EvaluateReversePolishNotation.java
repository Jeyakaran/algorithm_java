package com.home;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {
    public static int evaluateReversePolishNotation(String expression) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : expression.split(" ")) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> { int b = stack.pop(); stack.push(stack.pop() - b); }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> { int b = stack.pop(); stack.push(stack.pop() / b); }
                default  -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
