package com.demo.dao;

import com.demo.model.Employee;

public interface EmployeeDao {
    void add(Employee employee);
    Employee[] findAll();
    Employee findById(int id);
    Employee[] findByName(String name);
    Employee[] findByDepartment(String department, int limit);
}