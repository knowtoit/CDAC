package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao;

    public StudentServiceImpl(StudentDao dao) {
        this.dao = dao;
    }

    public void addStudent(Student student) { dao.add(student); }
    public Student[] getAllStudents() { return dao.findAll(); }
    public Student searchById(int id) { return dao.findById(id); }
    public Student[] searchByName(String name) { return dao.findByName(name); }

    public double calculateGpa(int id) {
        Student student = dao.findById(id);
        return student == null ? 0 : student.calculateGpa();
    }

    public boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}