package com.demo.test;

import com.demo.service.WaitNotifyExample;

public class TestWaitNotify {
    public static void main(String[] args) {
        WaitNotifyExample example = new WaitNotifyExample();

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                example.waitForNotify();
            }
        }, "Thread 1");

        thread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        example.sendNotify();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                example.waitForNotifyAll();
            }
        }, "Thread 2");

        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                example.waitForNotifyAll();
            }
        }, "Thread 3");

        thread2.start();
        thread3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        example.sendNotifyAll();
    }
}
