package com.demo.test;

import com.demo.service.ThreadTaskService;

public class TestAnonymousThreads {
    public static void main(String[] args) {
        ThreadTaskService service = new ThreadTaskService();

        Thread thread1 = new Thread() {
            public void run() {
                service.printTask("Thread 1");
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                service.printTask("Thread 2");
            }
        };

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                service.printTask("Thread 3");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
