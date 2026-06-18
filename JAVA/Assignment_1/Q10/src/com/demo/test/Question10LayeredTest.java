package com.demo.test;

import com.demo.dao.VectorDaoImpl;
import com.demo.service.VectorService;
import com.demo.service.VectorServiceImpl;

public class Question10LayeredTest {
    public static void main(String[] args) {
        VectorService service = new VectorServiceImpl(new VectorDaoImpl());
        service.displayUsingEnumeration();
    }
}