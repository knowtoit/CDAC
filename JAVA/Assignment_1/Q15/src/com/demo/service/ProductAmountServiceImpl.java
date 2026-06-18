package com.demo.service;

import com.demo.dao.ProductFileDao;
import com.demo.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductAmountServiceImpl implements ProductAmountService {
    private ProductFileDao dao;
    private List<Product> sharedProducts = new ArrayList<>();

    public ProductAmountServiceImpl(ProductFileDao dao) {
        this.dao = dao;
    }

    public void calculateAmountsUsingThreads() throws Exception {
        Thread producer = new Thread(() -> {
            try {
                sharedProducts = dao.readProducts();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        Thread consumer = new Thread(() -> {
            try {
                producer.join();
                dao.writeAmounts(sharedProducts);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}