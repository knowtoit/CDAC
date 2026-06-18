package com.demo.test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Student {
    private int sid;
    private String name;
    private LocalDate birthDate;
    private String degree;
    private double degreeMarks;

    Student(int sid, String name, LocalDate birthDate, String degree, double degreeMarks) {
        this.sid = sid;
        this.name = name;
        this.birthDate = birthDate;
        this.degree = degree;
        this.degreeMarks = degreeMarks;
    }

    String getDegree() { return degree; }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student student)) return false;
        return sid == student.sid;
    }

    public int hashCode() { return Objects.hash(sid); }

    public String toString() {
        return sid + " " + name + " " + birthDate + " " + degree + " " + degreeMarks;
    }
}

public class RecruitmentMenu {
    private static Student find(Map<Student, Set<String>> map, int sid) {
        for (Student student : map.keySet()) {
            if (student.equals(new Student(sid, "", LocalDate.now(), "", 0))) return student;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Student, Set<String>> students = new HashMap<>();
        int choice;
        do {
            System.out.println("\n1. Add new student");
            System.out.println("2. Add new skill for a student");
            System.out.println("3. Delete student");
            System.out.println("4. Delete skill for a student");
            System.out.println("5. Display students with given skill");
            System.out.println("6. Display students with given degree");
            System.out.println("7. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.print("sid/name/bdate yyyy-mm-dd/degree/marks: ");
                    Student student = new Student(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), LocalDate.parse(scanner.nextLine()), scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
                    students.put(student, new HashSet<>());
                }
                case 2 -> {
                    System.out.print("Sid: ");
                    Student student = find(students, Integer.parseInt(scanner.nextLine()));
                    System.out.print("Skill: ");
                    if (student != null) students.get(student).add(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("Sid: ");
                    Student student = find(students, Integer.parseInt(scanner.nextLine()));
                    if (student != null) students.remove(student);
                }
                case 4 -> {
                    System.out.print("Sid: ");
                    Student student = find(students, Integer.parseInt(scanner.nextLine()));
                    System.out.print("Skill: ");
                    if (student != null) students.get(student).remove(scanner.nextLine());
                }
                case 5 -> {
                    System.out.print("Skill: ");
                    String skill = scanner.nextLine();
                    students.forEach((student, skills) -> { if (skills.contains(skill)) System.out.println(student); });
                }
                case 6 -> {
                    System.out.print("Degree: ");
                    String degree = scanner.nextLine();
                    students.keySet().forEach(student -> { if (student.getDegree().equalsIgnoreCase(degree)) System.out.println(student); });
                }
                case 7 -> System.out.println("Thank you.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 7);
    }
}