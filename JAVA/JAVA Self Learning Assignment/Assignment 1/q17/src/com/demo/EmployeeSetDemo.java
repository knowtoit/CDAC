package com.demo;

import java.util.HashSet;

public class EmployeeSetDemo {

    // Employee class
    static class Employee {
        int id;
        String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Override hashCode()
        @Override
        public int hashCode() {
            return id;
        }

        // Override equals()
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Employee e = (Employee) obj;
            return this.id == e.id;
        }
    }

    // ------------------
    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();

        // Adding employees
        set.add(new Employee(1, "Sai"));
        set.add(new Employee(2, "Deepa"));
        set.add(new Employee(1, "Sai")); // duplicate

        // Print set
        System.out.println("Employees in set:");
        for (Employee e : set) {
            System.out.println(e.id + " " + e.name);
        }
    }
}