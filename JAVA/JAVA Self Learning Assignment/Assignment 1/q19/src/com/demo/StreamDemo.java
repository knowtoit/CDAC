package com.demo;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);

        // ------------------
        // Map (multiply each element by 2)
        List<Integer> mapped = list.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println("Map: " + mapped);

        // ------------------
        // Reduce (sum of elements)
        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Reduce (Sum): " + sum);

        // ------------------
        // Count
        long count = list.stream().count();
        System.out.println("Count: " + count);

        // ------------------
        // Sort
        List<Integer> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sorted);
    }
}