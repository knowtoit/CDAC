package com.demo.test;

import java.time.LocalDate;

abstract class Product {
    protected int id;
    protected String name;
    protected String type;
    protected LocalDate manufacturingDate;
    protected double price;

    Product(int id, String name, String type, LocalDate manufacturingDate, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.manufacturingDate = manufacturingDate;
        this.price = price;
    }

    abstract double calculateTax();

    public String toString() {
        return id + " " + name + " " + type + " price=" + price + " tax=" + calculateTax();
    }
}

class PerishableProduct extends Product {
    private LocalDate expiryDate;

    PerishableProduct(int id, String name, LocalDate manufacturingDate, LocalDate expiryDate, double price) {
        super(id, name, "perishable", manufacturingDate, price);
        this.expiryDate = expiryDate;
    }

    double calculateTax() {
        return price * 0.05;
    }
}

class NonPerishableProduct extends Product {
    private String category;

    NonPerishableProduct(int id, String name, LocalDate manufacturingDate, double price, String category) {
        super(id, name, "nonperishable", manufacturingDate, price);
        this.category = category;
    }

    double calculateTax() {
        return price * 0.15 + 100;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product milk = new PerishableProduct(1, "Milk", LocalDate.now(), LocalDate.now().plusDays(2), 50);
        Product chair = new NonPerishableProduct(2, "Chair", LocalDate.now(), 2000, "furniture");
        System.out.println(milk);
        System.out.println(chair);
    }
}