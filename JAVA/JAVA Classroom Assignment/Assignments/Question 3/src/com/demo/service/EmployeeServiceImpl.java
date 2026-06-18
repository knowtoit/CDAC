package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.model.ContractEmployee;
import com.demo.model.Employee;
import com.demo.model.SalariedEmployee;
import com.demo.model.Vendor;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao dao;

    public EmployeeServiceImpl(EmployeeDao dao) {
        this.dao = dao;
    }

    public void addEmployee(Employee employee) { dao.add(employee); }
    public Employee[] getAllEmployees() { return dao.findAll(); }
    public Employee searchById(int id) { return dao.findById(id); }
    public Employee[] searchByName(String name) { return dao.findByName(name); }
    public Employee[] employeesByDepartment(String department) { return dao.findByDepartment(department, 5); }

    public Employee[] employeesByType(String type) {
        Employee[] all = dao.findAll();
        Employee[] temp = new Employee[all.length];
        int index = 0;
        for (Employee employee : all) {
            if (matchesType(employee, type)) temp[index++] = employee;
        }
        Employee[] result = new Employee[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public Employee[] employeesByDesignation(String designation) {
        Employee[] all = dao.findAll();
        Employee[] temp = new Employee[all.length];
        int index = 0;
        for (Employee employee : all) {
            if (employee.getDesignation().equalsIgnoreCase(designation)) temp[index++] = employee;
        }
        Employee[] result = new Employee[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    private boolean matchesType(Employee employee, String type) {
        return switch (type.toLowerCase()) {
            case "salaried" -> employee instanceof SalariedEmployee;
            case "contract" -> employee instanceof ContractEmployee;
            case "vendor" -> employee instanceof Vendor;
            default -> false;
        };
    }
}