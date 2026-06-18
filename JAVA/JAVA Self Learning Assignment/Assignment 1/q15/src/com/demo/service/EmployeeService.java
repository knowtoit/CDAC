package com.demo.service;

import java.util.Collections;
import java.util.List;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

public class EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeService() {
        employeeDao = new EmployeeDao();
    }

    public List<Employee> getEmployeeList() {
        return employeeDao.getEmployees();
    }

    public void sortByIdUsingComparable(List<Employee> employees) {
        Collections.sort(employees);
    }

    public void sortByNameUsingComparator(List<Employee> employees) {
        Collections.sort(employees, new EmployeeNameComparator());
    }

    public void sortBySalaryUsingComparator(List<Employee> employees) {
        Collections.sort(employees, new EmployeeSalaryComparator());
    }

    public void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
