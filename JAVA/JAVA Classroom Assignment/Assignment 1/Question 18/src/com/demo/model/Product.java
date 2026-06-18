package com.demo.model;

public class Product implements ProductInfo {
    private int productId;
    private String name;
    private double price;
    private int qty;

    public Product(int productId, String name, double price, int qty) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQty() { return qty; }

    public String toString() {
        return productId + " " + name + " " + price + " " + qty;
    }
}