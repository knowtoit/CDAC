package com.demo.service;

import java.util.Comparator;

import com.demo.model.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        return Float.compare(employee1.getSal(), employee2.getSal());
    }
}
