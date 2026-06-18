package com.demo.model;

public class Student {
    private int studentId;
    private String name;

    public Student() {
    }

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int m1, int m2, int m3) {
        System.out.println("Total marks: " + (m1 + m2 + m3));
    }
}