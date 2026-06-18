package com.demo;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        // Create Queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // ------------------
        // Insert (add)
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Queue: " + q);

        // ------------------
        // Delete (remove)
        q.remove();
        System.out.println("After Remove: " + q);

        // ------------------
        // Peek (view front element)
        System.out.println("Front Element: " + q.peek());

        // ------------------
        // Iterate
        System.out.println("Iterating:");
        for (Integer i : q) {
            System.out.print(i + " ");
        }
    }
}