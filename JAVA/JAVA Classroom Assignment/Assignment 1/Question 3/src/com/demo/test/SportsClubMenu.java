package com.demo.test;

import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import java.util.Scanner;

public class SportsClubMenu {
    private static void display(Employee[] employees) {
        for (Employee employee : employees) {
            employee.display();
            System.out.printf("Net salary/payable amount: %.2f%n", employee.calculateSalary());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService service = new EmployeeServiceImpl(new EmployeeDaoImpl());
        SportsTestData.load(service);

        int choice;
        do {
            System.out.println("\n1. Display employees by type");
            System.out.println("2. Search by id");
            System.out.println("3. Search by name");
            System.out.println("4. Display all employee");
            System.out.println("5. Calculate salary for designation");
            System.out.println("6. Display 5 employees of department");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.print("Type salaried/contract/vendor: ");
                    display(service.employeesByType(scanner.nextLine()));
                }
                case 2 -> {
                    System.out.print("Id: ");
                    Employee employee = service.searchById(Integer.parseInt(scanner.nextLine()));
                    if (employee != null) employee.display();
                }
                case 3 -> {
                    System.out.print("Name: ");
                    display(service.searchByName(scanner.nextLine()));
                }
                case 4 -> display(service.getAllEmployees());
                case 5 -> {
                    System.out.print("Designation: ");
                    display(service.employeesByDesignation(scanner.nextLine()));
                }
                case 6 -> {
                    System.out.print("Department: ");
                    display(service.employeesByDepartment(scanner.nextLine()));
                }
                case 7 -> System.out.println("Thank you.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }
}