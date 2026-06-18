package com.demo.model;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int studId;
    private String name;
    private String degree;
    private String email;

    public Student() {
    }

    public Student(int studId, String name, String degree, String email) {
        this.studId = studId;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    public int getStudId() { return studId; }
    public void setStudId(int studId) { this.studId = studId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String toCsv() { return studId + "," + name + "," + degree + "," + email; }
    public String toString() { return studId + " " + name + " " + degree + " " + email; }
}