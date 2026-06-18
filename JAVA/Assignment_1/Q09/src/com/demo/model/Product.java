package com.demo.model;

public class Product implements ProductInfo {
    private int id;
    private String name;
    private double price;
    private int qty;

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Product(Product product, int qty) {
        this(product.id, product.name, product.price, qty);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQty() { return qty; }
    public void reduceQty(int qty) { this.qty -= qty; }
    public double amount() { return price * qty; }

    public String toString() {
        return id + ". " + name + " price=" + price + " qty=" + qty;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
}