package com.demo.test;

import com.demo.service.DifferentTask;
import com.demo.service.SameTask;

public class TestTasks {
    public static void main(String[] args) {
        SameTask sameTask = new SameTask();

        Thread thread1 = new Thread(sameTask, "Thread 1");
        Thread thread2 = new Thread(sameTask, "Thread 2");

        DifferentTask thread3 = new DifferentTask("Thread 3", "printing numbers");
        DifferentTask thread4 = new DifferentTask("Thread 4", "displaying messages");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
