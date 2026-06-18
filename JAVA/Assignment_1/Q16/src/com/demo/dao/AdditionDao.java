package com.demo.dao;

import com.demo.model.AdditionTaskData;
import java.util.List;

public interface AdditionDao {
    List<AdditionTaskData> createTasks();
}