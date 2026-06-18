package com.demo.service;

import com.demo.model.Employee;

public interface EmployeeService {
    void addEmployee(Employee employee);
    Employee[] getAllEmployees();
    Employee searchById(int id);
    Employee[] searchByName(String name);
    Employee[] employeesByType(String type);
    Employee[] employeesByDesignation(String designation);
    Employee[] employeesByDepartment(String department);
}