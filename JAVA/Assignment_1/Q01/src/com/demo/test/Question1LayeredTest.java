package com.demo.test;

import com.demo.dao.StudentDaoImpl;
import com.demo.model.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class Question1LayeredTest {
    public static void main(String[] args) {
        StudentService service = new StudentServiceImpl(new StudentDaoImpl());
        service.addStudent(new Student(1, "Divya", 78, 86, 89));
        service.addStudent(new Student(2, "Amit", 70, 75, 80));
        for (Student student : service.getAllStudents()) {
            student.display();
            System.out.println("GPA: " + student.calculateGpa());
        }
    }
}