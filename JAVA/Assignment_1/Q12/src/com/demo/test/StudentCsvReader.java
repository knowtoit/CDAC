package com.demo.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Student {
    private int studId;
    private String name;
    private String degree;
    private String email;

    Student(int studId, String name, String degree, String email) {
        this.studId = studId;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    public String toString() {
        return studId + " " + name + " " + degree + " " + email;
    }
}

public class StudentCsvReader {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                students.add(new Student(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3]));
            }
        }
        students.forEach(System.out::println);
    }
}