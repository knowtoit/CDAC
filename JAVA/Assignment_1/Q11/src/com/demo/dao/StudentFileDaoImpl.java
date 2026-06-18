package com.demo.dao;

import com.demo.model.Student;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class StudentFileDaoImpl implements StudentFileDao {
    public void writeCsv(List<Student> students) throws Exception {
        try (PrintWriter writer = new PrintWriter(new FileWriter("students.csv"))) {
            for (Student student : students) writer.println(student.toCsv());
        }
    }
}