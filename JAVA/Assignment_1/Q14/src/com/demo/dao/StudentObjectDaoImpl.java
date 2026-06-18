package com.demo.dao;

import com.demo.model.Student;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class StudentObjectDaoImpl implements StudentObjectDao {
    @SuppressWarnings("unchecked")
    public List<Student> readStudents() throws Exception {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"))) {
            return (List<Student>) in.readObject();
        }
    }
}