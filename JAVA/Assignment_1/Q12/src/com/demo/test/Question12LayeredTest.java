package com.demo.test;

import com.demo.dao.StudentFileDaoImpl;
import com.demo.service.StudentFileService;
import com.demo.service.StudentFileServiceImpl;

public class Question12LayeredTest {
    public static void main(String[] args) throws Exception {
        StudentFileService service = new StudentFileServiceImpl(new StudentFileDaoImpl());
        service.readStudents().forEach(System.out::println);
    }
}