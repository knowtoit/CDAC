package com.demo.dao;

import com.demo.model.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ProductFileDaoImpl implements ProductFileDao {
    public List<Product> readProducts() throws Exception {
        List<Product> products = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("productdata.dat"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                products.add(new Product(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3])));
            }
        }
        return products;
    }

    public void writeAmounts(List<Product> products) throws Exception {
        try (PrintWriter writer = new PrintWriter(new FileWriter("productamount.dat"))) {
            for (Product product : products) {
                writer.println(product.getId() + ":" + product.getName() + ":" + product.getQty() + ":" + product.getPrice() + ":" + product.amount());
            }
        }
    }
}