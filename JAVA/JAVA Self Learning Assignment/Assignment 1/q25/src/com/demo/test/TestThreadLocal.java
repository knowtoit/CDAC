package com.demo.test;

import com.demo.service.ThreadLocalData;
import com.demo.service.UserTask;

public class TestThreadLocal {
    public static void main(String[] args) {
        ThreadLocalData.setUserName("CDAC Student");

        UserTask thread1 = new UserTask("Thread 1");
        UserTask thread2 = new UserTask("Thread 2");
        UserTask thread3 = new UserTask("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        ThreadLocalData.removeUserName();
    }
}
