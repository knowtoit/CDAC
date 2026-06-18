package com.demo.test;

import com.demo.service.TaskService;

public class TestLambdaThreads {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        Thread thread1 = new Thread(() -> {
            service.printTask("Thread 1");
        });

        Thread thread2 = new Thread(() -> {
            service.printTask("Thread 2");
        });

        Thread thread3 = new Thread(() -> {
            service.printTask("Thread 3");
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
