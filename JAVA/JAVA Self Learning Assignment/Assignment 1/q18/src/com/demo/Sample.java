package com.demo;

import java.util.*;

public class Sample {

    // ------------------
    // ? extends (read only - upper bound)
    static void printList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // ------------------
    // ? super (write allowed - lower bound)
    static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    // ------------------
    // ? (unbounded)
    static void display(List<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    // ------------------
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Number> list2 = new ArrayList<>();

        // ? extends
        printList(list1);

        // ? super
        addNumbers(list2);
        System.out.println("After adding: " + list2);

        // ? (any type)
        display(list1);
    }
}