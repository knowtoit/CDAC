package com.demo.test;

public class PrimeCommandLine {
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please pass exactly 3 numbers as command line arguments.");
            return;
        }

        for (String arg : args) {
            int number = Integer.parseInt(arg);
            System.out.println("\nNumber: " + number);
            if (isPrime(number)) {
                printTable(number);
            } else {
                System.out.println("Number is not prime. Output after dividing by 10: " + (number / 10.0));
            }
        }
    }
}