package com.demo.dao;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    private Employee[] employees = new Employee[50];
    private int count;

    public void add(Employee employee) {
        employees[count++] = employee;
    }

    public Employee[] findAll() {
        Employee[] result = new Employee[count];
        System.arraycopy(employees, 0, result, 0, count);
        return result;
    }

    public Employee findById(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) return employees[i];
        }
        return null;
    }

    public Employee[] findByName(String name) {
        Employee[] temp = new Employee[count];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getName().equalsIgnoreCase(name)) temp[index++] = employees[i];
        }
        Employee[] result = new Employee[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public Employee[] findByDepartment(String department, int limit) {
        Employee[] temp = new Employee[Math.min(limit, count)];
        int index = 0;
        for (int i = 0; i < count && index < limit; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(department)) temp[index++] = employees[i];
        }
        Employee[] result = new Employee[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }
}