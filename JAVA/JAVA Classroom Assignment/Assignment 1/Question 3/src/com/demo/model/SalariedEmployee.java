package com.demo.model;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double basicSalary;

    public SalariedEmployee(String name, String mobileNo, String emailId, String department, String designation, LocalDate dateOfJoining, double basicSalary) {
        super(name, mobileNo, emailId, department, designation, dateOfJoining);
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        double da = basicSalary * 0.10;
        double hra = basicSalary * 0.15;
        double pf = basicSalary * 0.12;
        return basicSalary + da + hra - pf;
    }
}