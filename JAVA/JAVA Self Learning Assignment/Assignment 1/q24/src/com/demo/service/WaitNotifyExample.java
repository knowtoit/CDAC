package com.demo.service;

public class WaitNotifyExample {
    private boolean notifyCalled = false;
    private boolean notifyAllCalled = false;

    public synchronized void waitForNotify() {
        System.out.println(Thread.currentThread().getName() + " is waiting for notify()");

        while (!notifyCalled) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }

        System.out.println(Thread.currentThread().getName() + " resumed after notify()");
    }

    public synchronized void sendNotify() {
        notifyCalled = true;
        System.out.println("Main thread called notify()");
        notify();
    }

    public synchronized void waitForNotifyAll() {
        System.out.println(Thread.currentThread().getName() + " is waiting for notifyAll()");

        while (!notifyAllCalled) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }

        System.out.println(Thread.currentThread().getName() + " resumed after notifyAll()");
    }

    public synchronized void sendNotifyAll() {
        notifyAllCalled = true;
        System.out.println("Main thread called notifyAll()");
        notifyAll();
    }
}
