package com.demo.test;

import com.demo.dao.StudentObjectDaoImpl;
import com.demo.model.Student;
import com.demo.service.StudentObjectService;
import com.demo.service.StudentObjectServiceImpl;
import java.util.List;

public class Question13LayeredTest {
    public static void main(String[] args) throws Exception {
        StudentObjectService service = new StudentObjectServiceImpl(new StudentObjectDaoImpl());
        service.saveStudents(List.of(new Student(1, "Asha", "BE", "asha@mail.com")));
        System.out.println("students.dat written");
    }
}