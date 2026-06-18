package com.demo.test;

import com.demo.dao.StudentFileDaoImpl;
import com.demo.model.Student;
import com.demo.service.StudentFileService;
import com.demo.service.StudentFileServiceImpl;
import java.util.List;

public class Question11LayeredTest {
    public static void main(String[] args) throws Exception {
        StudentFileService service = new StudentFileServiceImpl(new StudentFileDaoImpl());
        service.saveStudents(List.of(new Student(1, "Asha", "BE", "asha@mail.com")));
        System.out.println("students.csv written");
    }
}