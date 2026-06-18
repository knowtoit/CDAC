package com.demo.test;

import java.util.Scanner;

public class StudentDetailsTest {
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
        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter student " + (i + 1) + " details");
            students[i] = acceptStudent(scanner);
        }
        for (Student student : students) {
            System.out.println();
            student.display();
        }
    }
}