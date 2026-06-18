package com.demo.test;

import com.demo.service.DeadlockExample;

public class TestDeadlock {
    public static void main(String[] args) {
        DeadlockExample deadlockExample = new DeadlockExample();
        deadlockExample.startDeadlock();
    }
}
