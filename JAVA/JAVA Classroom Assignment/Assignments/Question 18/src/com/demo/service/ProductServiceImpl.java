package com.demo.service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;
import java.sql.SQLException;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductDao dao;

    public ProductServiceImpl(ProductDao dao) { this.dao = dao; }
    public void addProduct(Product product) throws SQLException { dao.add(product); }
    public void deleteProduct(int productId) throws SQLException { dao.delete(productId); }
    public void modifyProduct(Product product) throws SQLException { dao.update(product); }
    public List<Product> displayAll() throws SQLException { return dao.findAll(); }
    public Product displayById(int productId) throws SQLException { return dao.findById(productId); }
    public List<Product> displayByQtyGreaterThan(int qty) throws SQLException { return dao.findByQtyGreaterThan(qty); }
}