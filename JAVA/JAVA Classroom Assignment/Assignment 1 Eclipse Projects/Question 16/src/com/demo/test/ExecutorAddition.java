package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class AddThreeTask implements Callable<Integer> {
    private int a;
    private int b;
    private int c;

    AddThreeTask(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer call() {
        return a + b + c;
    }
}

public class ExecutorAddition {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(5);
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 1; i <= 51; i += 3) {
            futures.add(service.submit(new AddThreeTask(i, i + 1, i + 2)));
        }

        int total = 0;
        for (Future<Integer> future : futures) {
            total += future.get();
        }
        service.shutdown();
        System.out.println("Addition of 1 to 51 = " + total);
    }
}