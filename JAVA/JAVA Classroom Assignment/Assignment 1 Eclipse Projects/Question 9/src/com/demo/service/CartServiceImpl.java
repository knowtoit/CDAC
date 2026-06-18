package com.demo.service;

import com.demo.dao.CartDao;
import com.demo.model.Product;
import java.util.List;
import java.util.Set;

public class CartServiceImpl implements CartService {
    private CartDao dao;

    public CartServiceImpl(CartDao dao) { this.dao = dao; }
    public List<Product> availableProducts() { return dao.products(); }

    public double buy(String username, int productId, int qty) {
        Product product = dao.findProduct(productId);
        if (product == null || product.getQty() < qty) throw new IllegalArgumentException("Product unavailable");
        product.reduceQty(qty);
        Product cartProduct = new Product(product, qty);
        dao.addToCart(username, cartProduct);
        return cartProduct.amount();
    }

    public Set<String> usernames() { return dao.carts().keySet(); }
    public List<Product> cart(String username) { return dao.cart(username); }

    public double billAmount(String username) {
        List<Product> products = dao.cart(username);
        if (products == null) return 0;
        return products.stream().mapToDouble(Product::amount).sum();
    }

    public void deliver(String username) { dao.deleteCart(username); }
}