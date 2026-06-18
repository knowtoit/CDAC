package com.demo.test;

public class Student {
    private int studentId;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    private double gpa;

    public Student(int studentId, String name, int m1, int m2, int m3) {
        this.studentId = studentId;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double calculateGpa() {
        gpa = (1.0 / 3.0) * m1 + (1.0 / 2.0) * m2 + (1.0 / 4.0) * m3;
        return gpa;
    }

    public void display() {
        System.out.println("Student Details:");
        System.out.println("____________");
        System.out.println("Student Id: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("M1: " + m1);
        System.out.println("M2: " + m2);
        System.out.println("M3: " + m3);
        if (gpa > 0) {
            System.out.printf("GPA: %.2f%n", gpa);
        }
    }
}