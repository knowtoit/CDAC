package com.demo.dao;

import com.demo.model.Student;

public interface StudentDao {
    void add(Student student);
    Student[] findAll();
    Student findById(int id);
    Student[] findByName(String name);
}