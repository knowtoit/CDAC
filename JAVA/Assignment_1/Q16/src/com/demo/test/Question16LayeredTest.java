package com.demo.test;

import com.demo.dao.AdditionDaoImpl;
import com.demo.service.AdditionService;
import com.demo.service.AdditionServiceImpl;

public class Question16LayeredTest {
    public static void main(String[] args) throws Exception {
        AdditionService service = new AdditionServiceImpl(new AdditionDaoImpl());
        System.out.println("Addition of 1 to 51 = " + service.addUsingExecutor());
    }
}