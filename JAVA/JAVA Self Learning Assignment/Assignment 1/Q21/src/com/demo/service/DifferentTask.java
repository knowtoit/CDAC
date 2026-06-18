package com.demo.service;

public class DifferentTask extends Thread {
    private String taskName;

    public DifferentTask(String threadName, String taskName) {
        super(threadName);
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is performing " + taskName + ": " + i);
        }
    }
}
