package com.demo.dao;

import com.demo.model.AdditionTaskData;
import java.util.ArrayList;
import java.util.List;

public class AdditionDaoImpl implements AdditionDao {
    public List<AdditionTaskData> createTasks() {
        List<AdditionTaskData> tasks = new ArrayList<>();
        for (int i = 1; i <= 51; i += 3) tasks.add(new AdditionTaskData(i, i + 1, i + 2));
        return tasks;
    }
}