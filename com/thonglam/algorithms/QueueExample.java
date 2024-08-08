package com.thonglam.algorithms;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("person one");
        queue.offer("person Two");
        queue.offer("person three");
        queue.offer("person four");
        queue.offer("person five");
        queue.offer("person six");
        queue.offer("person seven");

        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
    }
}
