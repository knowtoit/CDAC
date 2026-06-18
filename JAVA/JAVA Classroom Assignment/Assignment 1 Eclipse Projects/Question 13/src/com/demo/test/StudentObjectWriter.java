package com.demo.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentObjectWriter {
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

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            out.writeObject(students);
        }
        System.out.println("Data written to students.dat");
    }
}