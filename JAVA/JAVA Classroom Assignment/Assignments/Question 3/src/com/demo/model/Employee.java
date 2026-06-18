package com.demo.model;

import java.time.LocalDate;

public abstract class Employee implements PersonInfo {
    private static int nextId = 101;
    private int id;
    private String name;
    private String mobileNo;
    private String emailId;
    private String department;
    private String designation;
    private LocalDate dateOfJoining;

    protected Employee(String name, String mobileNo, String emailId, String department, String designation, LocalDate dateOfJoining) {
        this.id = nextId++;
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }
    public abstract double calculateSalary();

    public void display() {
        System.out.println(id + " " + name + " " + mobileNo + " " + emailId + " " + department + " " + designation + " doj=" + dateOfJoining);
    }
}