package com.demo.service;

public class SameTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is performing the same task: " + i);
        }
    }
}
