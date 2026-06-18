package com.demo.service;

public class UserTask extends Thread {
    public UserTask(String threadName) {
        super(threadName);
    }

    public void run() {
        System.out.println(getName() + " received thread local data: " + ThreadLocalData.getUserName());
    }
}
