package com.demo.test;

import com.demo.service.JoinExample;
import com.demo.service.SleepExample;
import com.demo.service.YieldExample;

public class TestThreadMethods {
    public static void main(String[] args) {
        System.out.println("Sleep method example");
        SleepExample sleepThread = new SleepExample("Sleep Thread");
        sleepThread.start();

        try {
            sleepThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println();
        System.out.println("Join method example");

        JoinExample joinThread1 = new JoinExample("Join Thread 1");
        JoinExample joinThread2 = new JoinExample("Join Thread 2");

        joinThread1.start();

        try {
            joinThread1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        joinThread2.start();

        try {
            joinThread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println();
        System.out.println("Yield method example");

        YieldExample yieldThread1 = new YieldExample("Yield Thread 1");
        YieldExample yieldThread2 = new YieldExample("Yield Thread 2");

        yieldThread1.start();
        yieldThread2.start();
    }
}
