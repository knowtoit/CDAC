package com.demo.service;

import com.demo.model.Product;
import java.sql.SQLException;
import java.util.List;

public interface ProductService {
    void addProduct(Product product) throws SQLException;
    void deleteProduct(int productId) throws SQLException;
    void modifyProduct(Product product) throws SQLException;
    List<Product> displayAll() throws SQLException;
    Product displayById(int productId) throws SQLException;
    List<Product> displayByQtyGreaterThan(int qty) throws SQLException;
}