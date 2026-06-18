package com.demo.test;

import com.demo.dao.StudentObjectDaoImpl;
import com.demo.service.StudentObjectService;
import com.demo.service.StudentObjectServiceImpl;

public class Question14LayeredTest {
    public static void main(String[] args) throws Exception {
        StudentObjectService service = new StudentObjectServiceImpl(new StudentObjectDaoImpl());
        service.readStudents().forEach(System.out::println);
    }
}