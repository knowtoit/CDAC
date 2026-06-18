package com.demo.dao;

import com.demo.model.Product;
import java.util.List;
import java.util.Map;

public interface CartDao {
    List<Product> products();
    Product findProduct(int productId);
    void addToCart(String username, Product product);
    Map<String, List<Product>> carts();
    List<Product> cart(String username);
    void deleteCart(String username);
}