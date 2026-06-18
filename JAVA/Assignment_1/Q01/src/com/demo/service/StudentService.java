package com.demo.service;

import com.demo.model.Student;

public interface StudentService {
    void addStudent(Student student);
    Student[] getAllStudents();
    Student searchById(int id);
    Student[] searchByName(String name);
    double calculateGpa(int id);
    boolean isPrime(int number);
}