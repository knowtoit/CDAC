package com.demo.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

class Student implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private int studId;
    private String name;
    private String degree;
    private String email;

    public String toString() {
        return studId + " " + name + " " + degree + " " + email;
    }
}

public class StudentObjectReader {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"))) {
            List<Student> students = (List<Student>) in.readObject();
            students.forEach(System.out::println);
        }
    }
}