package com.demo.service;

import com.demo.dao.AdditionDao;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AdditionServiceImpl implements AdditionService {
    private AdditionDao dao;

    public AdditionServiceImpl(AdditionDao dao) { this.dao = dao; }

    public int addUsingExecutor() throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<Integer>> futures = new ArrayList<>();
        dao.createTasks().forEach(task -> futures.add(executor.submit(task::total)));
        int total = 0;
        for (Future<Integer> future : futures) total += future.get();
        executor.shutdown();
        return total;
    }
}