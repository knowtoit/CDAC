package com.demo.dao;

import com.demo.model.Product;
import java.sql.SQLException;
import java.util.List;

public interface ProductDao {
    void add(Product product) throws SQLException;
    void delete(int productId) throws SQLException;
    void update(Product product) throws SQLException;
    List<Product> findAll() throws SQLException;
    Product findById(int productId) throws SQLException;
    List<Product> findByQtyGreaterThan(int qty) throws SQLException;
}