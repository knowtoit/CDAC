package com.demo.service;

import com.demo.model.Product;
import java.util.List;
import java.util.Set;

public interface CartService {
    List<Product> availableProducts();
    double buy(String username, int productId, int qty);
    Set<String> usernames();
    List<Product> cart(String username);
    double billAmount(String username);
    void deliver(String username);
}