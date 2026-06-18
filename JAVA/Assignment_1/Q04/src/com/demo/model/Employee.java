package com.demo.model;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private String department;
    private String designation;

    public Employee() {
    }

    public Employee(int id, String name, double salary, String department, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.designation = designation;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public int compareTo(Employee other) { return Integer.compare(id, other.id); }
    public boolean equals(Object obj) { return obj instanceof Employee employee && id == employee.id; }
    public int hashCode() { return Objects.hash(id); }
    public String toString() { return id + " " + name + " " + salary + " " + department + " " + designation; }
}