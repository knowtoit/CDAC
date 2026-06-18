package com.demo.service;

public class ThreadClassExample extends Thread {
    private String threadName;

    public ThreadClassExample(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " using Thread class: " + i);
        }
    }
}
