package com.demo.model;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String type;
    private LocalDate manufacturingDate;
    private LocalDate expiryDate;
    private String category;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String type, LocalDate manufacturingDate, LocalDate expiryDate, String category, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.category = category;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public LocalDate getManufacturingDate() { return manufacturingDate; }
    public void setManufacturingDate(LocalDate manufacturingDate) { this.manufacturingDate = manufacturingDate; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double calculateTax() {
        if ("perishable".equalsIgnoreCase(type)) return price * 0.05;
        return price * 0.15 + 100;
    }
}