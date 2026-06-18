package com.demo.test;

import java.util.List;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class TestEmployeeSorting {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        List<Employee> employees = employeeService.getEmployeeList();

        System.out.println("Original Employee List");
        employeeService.displayEmployees(employees);

        System.out.println();
        System.out.println("Sorting by id using Comparable");
        employeeService.sortByIdUsingComparable(employees);
        employeeService.displayEmployees(employees);

        System.out.println();
        System.out.println("Sorting by name using Comparator");
        employeeService.sortByNameUsingComparator(employees);
        employeeService.displayEmployees(employees);

        System.out.println();
        System.out.println("Sorting by salary using Comparator");
        employeeService.sortBySalaryUsingComparator(employees);
        employeeService.displayEmployees(employees);
    }
}
