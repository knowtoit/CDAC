package com.demo;

// ------------------
// Checked Exception
class MyCheckedException extends Exception {
    public MyCheckedException(String msg) {
        super(msg);
    }
}

// ------------------
// Unchecked Exception
class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String msg) {
        super(msg);
    }
}

// ------------------
public class ExceptionDemo {

    // Method for checked exception
    static void checkAge(int age) throws MyCheckedException {
        if (age < 18) {
            throw new MyCheckedException("Age is less than 18");
        }
    }

    // Method for unchecked exception
    static void checkNumber(int num) {
        if (num < 0) {
            throw new MyUncheckedException("Number is negative");
        }
    }

    public static void main(String[] args) {

        // Checked Exception
        try {
            checkAge(16);
        } catch (MyCheckedException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }

        // Unchecked Exception
        checkNumber(-5);
    }
}