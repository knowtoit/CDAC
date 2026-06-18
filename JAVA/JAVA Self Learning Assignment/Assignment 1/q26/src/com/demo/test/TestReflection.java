package com.demo.test;

import java.lang.reflect.Method;

import com.demo.service.EmployeeService;

public class TestReflection {
    public static void main(String[] args) {
        try {
            EmployeeService employeeService = new EmployeeService();

            Class<?> employeeClass = employeeService.getClass();
            Method method = employeeClass.getDeclaredMethod("displayEmployeeDetails");

            method.setAccessible(true);
            method.invoke(employeeService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
