package com.demo.dao;

import com.demo.model.Product;
import com.demo.dao.DbConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    public void add(Product product) throws SQLException {
        try (Connection con = DbConfig.getConnection();
             PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)")) {
            ps.setInt(1, product.getProductId());
            ps.setString(2, product.getName());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getQty());
            ps.executeUpdate();
        }
    }

    public void delete(int productId) throws SQLException {
        try (Connection con = DbConfig.getConnection();
             PreparedStatement ps = con.prepareStatement("delete from product where productid=?")) {
            ps.setInt(1, productId);
            ps.executeUpdate();
        }
    }

    public void update(Product product) throws SQLException {
        try (Connection con = DbConfig.getConnection();
             PreparedStatement ps = con.prepareStatement("update product set pname=?, price=?, qty=? where productid=?")) {
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getQty());
            ps.setInt(4, product.getProductId());
            ps.executeUpdate();
        }
    }

    public List<Product> findAll() throws SQLException {
        try (Connection con = DbConfig.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("select * from product")) {
            return readProducts(rs);
        }
    }

    public Product findById(int productId) throws SQLException {
        try (Connection con = DbConfig.getConnection();
             PreparedStatement ps = con.prepareStatement("select * from product where productid=?")) {
            ps.setInt(1, productId);
            try (ResultSet rs = ps.executeQuery()) {
                List<Product> products = readProducts(rs);
                return products.isEmpty() ? null : products.get(0);
            }
        }
    }

    public List<Product> findByQtyGreaterThan(int qty) throws SQLException {
        try (Connection con = DbConfig.getConnection();
             PreparedStatement ps = con.prepareStatement("select * from product where qty>?")) {
            ps.setInt(1, qty);
            try (ResultSet rs = ps.executeQuery()) {
                return readProducts(rs);
            }
        }
    }

    private List<Product> readProducts(ResultSet rs) throws SQLException {
        List<Product> products = new ArrayList<>();
        while (rs.next()) {
            products.add(new Product(rs.getInt("productid"), rs.getString("pname"), rs.getDouble("price"), rs.getInt("qty")));
        }
        return products;
    }
}