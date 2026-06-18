package com.demo.service;

public class ThreadTaskService {
    public void printTask(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: " + i);
        }
    }
}
