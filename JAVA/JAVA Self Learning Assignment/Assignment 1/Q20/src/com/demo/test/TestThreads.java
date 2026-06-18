package com.demo.test;

import com.demo.service.RunnableInterfaceExample;
import com.demo.service.ThreadClassExample;

public class TestThreads {
    public static void main(String[] args) {
        ThreadClassExample thread1 = new ThreadClassExample("Thread 1");
        ThreadClassExample thread2 = new ThreadClassExample("Thread 2");

        RunnableInterfaceExample runnable1 = new RunnableInterfaceExample("Thread 3");
        RunnableInterfaceExample runnable2 = new RunnableInterfaceExample("Thread 4");

        Thread thread3 = new Thread(runnable1);
        Thread thread4 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
