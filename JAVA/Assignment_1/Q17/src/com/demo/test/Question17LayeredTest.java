package com.demo.test;

import com.demo.dao.GradeDaoImpl;
import com.demo.service.GradeService;
import com.demo.service.GradeServiceImpl;

public class Question17LayeredTest {
    public static void main(String[] args) {
        GradeService service = new GradeServiceImpl(new GradeDaoImpl());
        System.out.println(service.gradeRange("Distinction"));
    }
}