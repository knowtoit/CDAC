package com.demo;

import java.util.*;

public class WrapperClasses {
    public static void main(String[] args) {

        // List of Integer (Wrapper class)
        ArrayList<Integer> list = new ArrayList<>();

        // ------------------
        // Insert
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);
        System.out.println("After Insert: " + list);

        // ------------------
        // Delete
        list.remove(Integer.valueOf(20));
        System.out.println("After Delete: " + list);

        // ------------------
        // Search
        boolean found = list.contains(10);
        System.out.println("Search 10: " + found);

        // ------------------
        // Iterate
        System.out.println("Iterating:");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // ------------------
        // Sort
        Collections.sort(list);
        System.out.println("After Sort: " + list);
    }
}