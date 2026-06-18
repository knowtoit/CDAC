package com.demo.dao;

import com.demo.model.Student;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class StudentObjectDaoImpl implements StudentObjectDao {
    public void writeStudents(List<Student> students) throws Exception {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            out.writeObject(students);
        }
    }
}