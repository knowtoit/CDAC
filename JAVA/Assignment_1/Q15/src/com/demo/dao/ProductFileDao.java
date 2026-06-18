package com.demo.dao;

import com.demo.model.Product;
import java.util.List;

public interface ProductFileDao {
    List<Product> readProducts() throws Exception;
    void writeAmounts(List<Product> products) throws Exception;
}