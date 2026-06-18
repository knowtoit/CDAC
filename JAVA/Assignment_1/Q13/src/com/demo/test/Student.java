package com.demo.test;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int studId;
    private String name;
    private String degree;
    private String email;

    public Student(int studId, String name, String degree, String email) {
        this.studId = studId;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    public String toString() {
        return studId + " " + name + " " + degree + " " + email;
    }
}