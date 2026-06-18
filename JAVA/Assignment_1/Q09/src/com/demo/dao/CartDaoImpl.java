package com.demo.dao;

import com.demo.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CartDaoImpl implements CartDao {
    private static final List<Product> PRODUCTS = new ArrayList<>();
    private Map<String, List<Product>> carts = new HashMap<>();

    static {
        PRODUCTS.add(new Product(1, "Shoes", 3000, 10));
        PRODUCTS.add(new Product(2, "Shirts", 1200, 25));
        PRODUCTS.add(new Product(3, "Bags", 1800, 12));
        PRODUCTS.add(new Product(4, "Jeans", 2200, 15));
        PRODUCTS.add(new Product(5, "Watch", 2500, 8));
        PRODUCTS.add(new Product(6, "Wallet", 700, 30));
        PRODUCTS.add(new Product(7, "Laptop Bag", 2000, 10));
        PRODUCTS.add(new Product(8, "Cap", 400, 40));
        PRODUCTS.add(new Product(9, "Belt", 600, 20));
        PRODUCTS.add(new Product(10, "Socks", 150, 100));
    }

    public List<Product> products() { return PRODUCTS; }

    public Product findProduct(int productId) {
        for (Product product : PRODUCTS) {
            if (product.getId() == productId) return product;
        }
        return null;
    }

    public void addToCart(String username, Product product) {
        carts.computeIfAbsent(username, key -> new ArrayList<>()).add(product);
    }

    public Map<String, List<Product>> carts() { return carts; }
    public List<Product> cart(String username) { return carts.get(username); }
    public void deleteCart(String username) { carts.remove(username); }
}