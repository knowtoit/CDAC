package com.demo.model;

import java.time.LocalDate;

public class Vendor extends Employee {
    private int numberOfEmployees;
    private double amount;

    public Vendor(String name, String mobileNo, String emailId, String department, String designation, LocalDate dateOfJoining, int numberOfEmployees, double amount) {
        super(name, mobileNo, emailId, department, designation, dateOfJoining);
        this.numberOfEmployees = numberOfEmployees;
        this.amount = amount;
    }

    public double calculateSalary() {
        return amount + amount * 0.18;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}