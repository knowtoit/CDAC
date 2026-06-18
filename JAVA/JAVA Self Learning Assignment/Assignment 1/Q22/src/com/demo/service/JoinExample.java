package com.demo.service;

public class JoinExample extends Thread {
    public JoinExample(String threadName) {
        super(threadName);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " using join(): " + i);
        }
    }
}
