package com.demo.test;

import com.demo.service.CartService;

public class CartTestData {
    public static void load(CartService service) {
        service.buy("demo", 1, 1);
        service.buy("demo", 3, 2);
    }
}