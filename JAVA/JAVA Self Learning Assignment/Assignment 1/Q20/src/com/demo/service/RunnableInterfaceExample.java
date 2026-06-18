package com.demo.service;

public class RunnableInterfaceExample implements Runnable {
    private String threadName;

    public RunnableInterfaceExample(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " using Runnable interface: " + i);
        }
    }
}
