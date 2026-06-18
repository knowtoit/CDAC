package com.demo.dao;

import com.demo.model.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StudentFileDaoImpl implements StudentFileDao {
    public List<Student> readCsv() throws Exception {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                students.add(new Student(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3]));
            }
        }
        return students;
    }
}