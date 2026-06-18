package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;

public class EmployeeDao {
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(104, "Rahul", "9876543210", 45000.00f, "IT", "Developer"));
        employees.add(new Employee(102, "Amit", "9876543211", 55000.00f, "HR", "Manager"));
        employees.add(new Employee(105, "Sneha", "9876543212", 35000.00f, "Finance", "Accountant"));
        employees.add(new Employee(101, "Priya", "9876543213", 65000.00f, "IT", "Team Lead"));
        employees.add(new Employee(103, "Neha", "9876543214", 40000.00f, "Admin", "Executive"));

        return employees;
    }
}
