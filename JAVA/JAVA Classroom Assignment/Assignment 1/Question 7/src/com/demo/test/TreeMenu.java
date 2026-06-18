package com.demo.test;

import com.demo.dao.TreeDaoImpl;
import com.demo.service.TreeService;
import com.demo.service.TreeServiceImpl;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TreeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeService service = new TreeServiceImpl(new TreeDaoImpl());
        TreeTestData.load(service);
        int choice;
        do {
            System.out.println("\n1. Find list of trees for a city");
            System.out.println("2. Delete list of a city");
            System.out.println("3. Add new entry in TreeMap");
            System.out.println("4. Display all city names and list of trees");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.print("City: ");
                    System.out.println(service.treesForCity(scanner.nextLine()));
                }
                case 2 -> {
                    System.out.print("City: ");
                    service.deleteCity(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("Trees comma separated: ");
                    List<String> trees = Arrays.asList(scanner.nextLine().split(","));
                    System.out.println(service.addCityTrees(city, trees) ? "Added" : "City already exists");
                }
                case 4 -> {
                    Iterator<Map.Entry<String, List<String>>> iterator = service.allCityTrees().entrySet().iterator();
                    while (iterator.hasNext()) System.out.println(iterator.next());
                    service.allCityTrees().forEach((city, trees) -> System.out.println(city + " -> " + trees));
                }
                case 5 -> System.out.println("Thank you.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}