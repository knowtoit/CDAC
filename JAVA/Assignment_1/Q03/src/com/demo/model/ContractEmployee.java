package com.demo.model;

import java.time.LocalDate;

public class ContractEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String name, String mobileNo, String emailId, String department, String designation, LocalDate dateOfJoining, int hoursWorked, double hourlyRate) {
        super(name, mobileNo, emailId, department, designation, dateOfJoining);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}