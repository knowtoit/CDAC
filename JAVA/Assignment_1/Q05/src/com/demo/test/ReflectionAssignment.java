package com.demo.test;

import com.demo.dao.ReflectionDaoImpl;
import com.demo.service.ReflectionService;
import com.demo.service.ReflectionServiceImpl;

public class ReflectionAssignment {
    public static void main(String[] args) throws Exception {
        ReflectionService service = new ReflectionServiceImpl(new ReflectionDaoImpl());
        service.displayClassDetailsAndInvokeMethods();
    }
}