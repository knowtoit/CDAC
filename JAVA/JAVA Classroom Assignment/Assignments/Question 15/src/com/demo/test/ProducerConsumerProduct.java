package com.demo.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class Product {
    int id;
    String name;
    int qty;
    double price;

    Product(String line) {
        String[] parts = line.split(":");
        id = Integer.parseInt(parts[0]);
        name = parts[1];
        qty = Integer.parseInt(parts[2]);
        price = Double.parseDouble(parts[3]);
    }

    double amount() {
        return qty * price + price * 0.10;
    }
}

class ProductBuffer {
    private Product product;
    private boolean available;
    private boolean finished;

    synchronized void produce(Product product) throws InterruptedException {
        while (available) wait();
        this.product = product;
        available = true;
        notifyAll();
    }

    synchronized Product consume() throws InterruptedException {
        while (!available && !finished) wait();
        if (!available && finished) return null;
        Product current = product;
        available = false;
        notifyAll();
        return current;
    }

    synchronized void finish() {
        finished = true;
        notifyAll();
    }
}

public class ProducerConsumerProduct {
    public static void main(String[] args) throws Exception {
        ProductBuffer buffer = new ProductBuffer();

        Thread producer = new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new FileReader("productdata.dat"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    buffer.produce(new Product(line));
                }
                buffer.finish();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumer = new Thread(() -> {
            try (PrintWriter writer = new PrintWriter(new FileWriter("productamount.dat"))) {
                Product product;
                while ((product = buffer.consume()) != null) {
                    writer.println(product.id + ":" + product.name + ":" + product.qty + ":" + product.price + ":" + product.amount());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
        System.out.println("productamount.dat created.");
    }
}