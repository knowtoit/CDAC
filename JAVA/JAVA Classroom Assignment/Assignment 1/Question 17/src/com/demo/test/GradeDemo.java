package com.demo.test;

import java.util.Scanner;

enum Grade {
    Distinction(80, 100),
    First(65, 79),
    Second(50, 64),
    Pass(40, 49),
    Fail(0, 39);

    private int min;
    private int max;

    Grade(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() { return min; }
    public int getMax() { return max; }
}

public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade: ");
        Grade grade = Grade.valueOf(scanner.nextLine());
        System.out.println("Minimum marks: " + grade.getMin());
        System.out.println("Maximum marks: " + grade.getMax());
    }
}