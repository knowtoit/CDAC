package com.demo.test;

import com.demo.dao.ProductFileDaoImpl;
import com.demo.service.ProductAmountService;
import com.demo.service.ProductAmountServiceImpl;

public class Question15LayeredTest {
    public static void main(String[] args) throws Exception {
        ProductAmountService service = new ProductAmountServiceImpl(new ProductFileDaoImpl());
        service.calculateAmountsUsingThreads();
        System.out.println("productamount.dat created");
    }
}