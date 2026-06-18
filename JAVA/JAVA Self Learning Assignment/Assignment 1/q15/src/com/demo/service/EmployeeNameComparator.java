package com.demo.service;

import java.util.Comparator;

import com.demo.model.Employee;

public class EmployeeNameComparator implements Comparator<Employee> {
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }
}
