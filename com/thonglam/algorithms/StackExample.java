package com.thonglam.algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First Request");
        stack.push("Second Request");
        stack.push("third request");

        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
