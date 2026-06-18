package com.demo.service;

public class DeadlockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void startDeadlock() {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                synchronized (lock1) {
                    System.out.println("Thread 1 locked lock1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread 1 was interrupted");
                    }

                    synchronized (lock2) {
                        System.out.println("Thread 1 locked lock2");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                synchronized (lock2) {
                    System.out.println("Thread 2 locked lock2");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread 2 was interrupted");
                    }

                    synchronized (lock1) {
                        System.out.println("Thread 2 locked lock1");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
