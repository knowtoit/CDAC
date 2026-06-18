package com.demo.test;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int studId;
    private String name;
    private String degree;
    private String email;

    Student(int studId, String name, String degree, String email) {
        this.studId = studId;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    String toCsv() {
        return studId + "," + name + "," + degree + "," + email;
    }
}

public class StudentCsvWriter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String choice;
        do {
            System.out.print("Id/name/degree/email: ");
            students.add(new Student(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
            System.out.print("Add more y/n? ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));

        try (PrintWriter writer = new PrintWriter(new FileWriter("students.csv"))) {
            for (Student student : students) {
                writer.println(student.toCsv());
            }
        }
        System.out.println("Data written to students.csv");
    }
}