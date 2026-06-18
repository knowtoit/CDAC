package com.demo.dao;

import com.demo.model.Student;

public class StudentDaoImpl implements StudentDao {
    private Student[] students = new Student[50];
    private int count;

    public void add(Student student) {
        students[count++] = student;
    }

    public Student[] findAll() {
        Student[] result = new Student[count];
        System.arraycopy(students, 0, result, 0, count);
        return result;
    }

    public Student findById(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getStudentId() == id) return students[i];
        }
        return null;
    }

    public Student[] findByName(String name) {
        Student[] temp = new Student[count];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (students[i].getName().equalsIgnoreCase(name)) temp[index++] = students[i];
        }
        Student[] result = new Student[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }
}