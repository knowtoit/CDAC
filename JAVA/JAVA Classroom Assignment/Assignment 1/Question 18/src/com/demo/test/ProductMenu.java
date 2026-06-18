package com.demo.test;

import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
import java.util.Scanner;

public class ProductMenu {
    public static void main(String[] args) throws Exception {
        ProductTestData.printHelp();
        Scanner scanner = new Scanner(System.in);
        ProductService service = new ProductServiceImpl(new ProductDaoImpl());
        int choice;
        do {
            System.out.println("\n1. Add product");
            System.out.println("2. Delete product");
            System.out.println("3. Modify product");
            System.out.println("4. Display all products");
            System.out.println("5. Display product by id");
            System.out.println("6. Display products with qty greater than given qty");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.print("id/name/price/qty: ");
                    service.addProduct(new Product(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
                }
                case 2 -> {
                    System.out.print("Product id: ");
                    service.deleteProduct(Integer.parseInt(scanner.nextLine()));
                }
                case 3 -> {
                    System.out.print("id/name/price/qty: ");
                    service.modifyProduct(new Product(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), Double.parseDouble(scanner.nextLine()), Integer.parseInt(scanner.nextLine())));
                }
                case 4 -> service.displayAll().forEach(System.out::println);
                case 5 -> {
                    System.out.print("Product id: ");
                    System.out.println(service.displayById(Integer.parseInt(scanner.nextLine())));
                }
                case 6 -> {
                    System.out.print("Qty: ");
                    service.displayByQtyGreaterThan(Integer.parseInt(scanner.nextLine())).forEach(System.out::println);
                }
                case 7 -> System.out.println("Thank you.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }
}