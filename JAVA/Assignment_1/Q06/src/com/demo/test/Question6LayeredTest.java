package com.demo.test;

import com.demo.dao.AnnotationDaoImpl;
import com.demo.service.AnnotationService;
import com.demo.service.AnnotationServiceImpl;

public class Question6LayeredTest {
    public static void main(String[] args) throws Exception {
        AnnotationService service = new AnnotationServiceImpl(new AnnotationDaoImpl());
        service.invokeAnnotatedMethods();
    }
}