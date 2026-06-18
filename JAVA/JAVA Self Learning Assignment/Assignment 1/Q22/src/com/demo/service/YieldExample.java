package com.demo.service;

public class YieldExample extends Thread {
    public YieldExample(String threadName) {
        super(threadName);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " using yield(): " + i);
            Thread.yield();
        }
    }
}
