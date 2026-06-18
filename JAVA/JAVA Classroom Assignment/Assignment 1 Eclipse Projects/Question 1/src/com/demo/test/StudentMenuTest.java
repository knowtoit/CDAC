package com.demo.test;

import java.util.Scanner;

public class StudentMenuTest {
    private static Student acceptStudent(Scanner scanner) {
        System.out.print("Student id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("M1: ");
        int m1 = Integer.parseInt(scanner.nextLine());
        System.out.print("M2: ");
        int m2 = Integer.parseInt(scanner.nextLine());
        System.out.print("M3: ");
        int m3 = Integer.parseInt(scanner.nextLine());
        return new Student(id, name, m1, m2, m3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students? ");
        int count = Integer.parseInt(scanner.nextLine());
        Student[] students = new Student[count];
        for (int i = 0; i < count; i++) {
            students[i] = acceptStudent(scanner);
        }

        int choice;
        do {
            System.out.println("\n1. Display All Student");
            System.out.println("2. Search by id");
            System.out.println("3. Search by name");
            System.out.println("4. Calculate GPA of a student");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    for (Student student : students) {
                        student.display();
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    for (Student student : students) {
                        if (student.getStudentId() == id) {
                            student.display();
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    for (Student student : students) {
                        if (student.getName().equalsIgnoreCase(name)) {
                            student.display();
                        }
                    }
                }
                case 4 -> {
                    System.out.print("Enter id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    for (Student student : students) {
                        if (student.getStudentId() == id) {
                            System.out.printf("GPA: %.2f%n", student.calculateGpa());
                        }
                    }
                }
                case 5 -> System.out.println("Thank you.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}