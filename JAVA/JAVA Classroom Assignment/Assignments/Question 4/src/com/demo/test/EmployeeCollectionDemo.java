package com.demo.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeMap;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double salary;
    private String department;
    private String designation;

    Employee(int id, String name, double salary, String department, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.designation = designation;
    }

    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee employee)) return false;
        return id == employee.id;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public String toString() {
        return id + " " + name + " " + salary + " " + department + " " + designation;
    }
}

public class EmployeeCollectionDemo {
    public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Asha", 60000, "IT", "Developer"));
        employees.add(new Employee(2, "Nitin", 55000, "HR", "Executive"));
        employees.add(new Employee(1, "Duplicate", 50000, "IT", "Developer"));
        System.out.println("HashSet employees:");
        employees.forEach(System.out::println);

        TreeMap<Integer, Employee> map = new TreeMap<>();
        for (Employee employee : employees) {
            // duplicate ids are already removed by HashSet
        }
        map.put(1, new Employee(1, "Asha", 60000, "IT", "Developer"));
        map.put(2, new Employee(2, "Nitin", 55000, "HR", "Executive"));
        System.out.println("\nTreeMap employees:");
        map.forEach((id, employee) -> System.out.println(id + " -> " + employee));
    }
}