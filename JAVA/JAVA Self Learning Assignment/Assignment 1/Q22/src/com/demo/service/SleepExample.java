package com.demo.service;

public class SleepExample extends Thread {
    public SleepExample(String threadName) {
        super(threadName);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " using sleep(): " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted");
            }
        }
    }
}
