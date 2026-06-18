package com.demo.test;

import com.demo.dao.CartDaoImpl;
import com.demo.model.Product;
import com.demo.service.CartService;
import com.demo.service.CartServiceImpl;
import java.util.List;
import java.util.Scanner;

public class TestCartProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CartService service = new CartServiceImpl(new CartDaoImpl());
        CartTestData.load(service);
        int choice;
        do {
            System.out.println("\n1. Buy Products");
            System.out.println("2. Send the delivery of cart");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    service.availableProducts().forEach(System.out::println);
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Product id: ");
                    int productId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Qty: ");
                    int qty = Integer.parseInt(scanner.nextLine());
                    System.out.println("Amount - " + service.buy(username, productId, qty) + "/-");
                }
                case 2 -> {
                    System.out.println("Users: " + service.usernames());
                    System.out.print("Username: ");
                    String username = scanner.nextLine();
                    List<Product> cart = service.cart(username);
                    if (cart != null) cart.forEach(System.out::println);
                    System.out.println("Bill amount: " + service.billAmount(username));
                    System.out.print("Do you want to deliver y/n? ");
                    if (scanner.nextLine().equalsIgnoreCase("y")) {
                        service.deliver(username);
                        System.out.println("Order delivered.");
                    }
                }
                case 3 -> System.out.println("Thank you.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }
}