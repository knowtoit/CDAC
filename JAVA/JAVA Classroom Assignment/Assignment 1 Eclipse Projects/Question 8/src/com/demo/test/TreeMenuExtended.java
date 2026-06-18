package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMenuExtended {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> cityTrees = new TreeMap<>();
        cityTrees.put("Mumbai", new ArrayList<>(List.of("Banyan", "Mango")));
        cityTrees.put("Pune", new ArrayList<>(List.of("Neem", "Gulmohar")));
        int choice;
        do {
            System.out.println("\n1. Find list of trees for a city");
            System.out.println("2. Delete list of a city");
            System.out.println("3. Add new entry in TreeMap");
            System.out.println("4. Display all city names and list of trees");
            System.out.println("5. Add a new tree in existing list");
            System.out.println("6. Display all cities for a tree");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.print("City: ");
                    System.out.println(cityTrees.get(scanner.nextLine()));
                }
                case 2 -> {
                    System.out.print("City: ");
                    cityTrees.remove(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    if (cityTrees.containsKey(city)) {
                        System.out.println("City already exists");
                    } else {
                        System.out.print("Trees comma separated: ");
                        cityTrees.put(city, new ArrayList<>(Arrays.asList(scanner.nextLine().split(","))));
                    }
                }
                case 4 -> cityTrees.forEach((city, trees) -> System.out.println(city + " -> " + trees));
                case 5 -> {
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("Tree: ");
                    String tree = scanner.nextLine();
                    cityTrees.computeIfPresent(city, (key, trees) -> { trees.add(tree); return trees; });
                }
                case 6 -> {
                    System.out.print("Tree: ");
                    String tree = scanner.nextLine();
                    cityTrees.forEach((city, trees) -> {
                        if (trees.stream().anyMatch(value -> value.equalsIgnoreCase(tree))) System.out.println(city);
                    });
                }
                case 7 -> System.out.println("Thank you.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }
}