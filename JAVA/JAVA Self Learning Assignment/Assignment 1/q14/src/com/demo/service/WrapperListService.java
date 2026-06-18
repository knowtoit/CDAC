package com.demo.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WrapperListService {
    public void performIntegerListOperations() {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Integer list after insertion: " + numbers);

        numbers.remove(Integer.valueOf(50));
        System.out.println("Integer list after deleting 50: " + numbers);

        if (numbers.contains(20)) {
            System.out.println("20 is found in Integer list");
        } else {
            System.out.println("20 is not found in Integer list");
        }

        System.out.println("Iterating Integer list:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        Collections.sort(numbers);
        System.out.println("Integer list after sorting: " + numbers);
    }

    public void performDoubleListOperations() {
        List<Double> salaries = new ArrayList<Double>();

        salaries.add(45000.50);
        salaries.add(25000.75);
        salaries.add(55000.25);
        salaries.add(35000.00);

        System.out.println("Double list after insertion: " + salaries);

        salaries.remove(Double.valueOf(25000.75));
        System.out.println("Double list after deleting 25000.75: " + salaries);

        if (salaries.contains(35000.00)) {
            System.out.println("35000.00 is found in Double list");
        } else {
            System.out.println("35000.00 is not found in Double list");
        }

        System.out.println("Iterating Double list:");
        for (Double salary : salaries) {
            System.out.println(salary);
        }

        Collections.sort(salaries);
        System.out.println("Double list after sorting: " + salaries);
    }

    public void performCharacterListOperations() {
        List<Character> grades = new ArrayList<Character>();

        grades.add('C');
        grades.add('A');
        grades.add('D');
        grades.add('B');

        System.out.println("Character list after insertion: " + grades);

        grades.remove(Character.valueOf('D'));
        System.out.println("Character list after deleting D: " + grades);

        if (grades.contains('A')) {
            System.out.println("A is found in Character list");
        } else {
            System.out.println("A is not found in Character list");
        }

        System.out.println("Iterating Character list:");
        for (Character grade : grades) {
            System.out.println(grade);
        }

        Collections.sort(grades);
        System.out.println("Character list after sorting: " + grades);
    }

    public void performBooleanListOperations() {
        List<Boolean> results = new ArrayList<Boolean>();

        results.add(true);
        results.add(false);
        results.add(true);

        System.out.println("Boolean list after insertion: " + results);

        results.remove(Boolean.FALSE);
        System.out.println("Boolean list after deleting false: " + results);

        if (results.contains(true)) {
            System.out.println("true is found in Boolean list");
        } else {
            System.out.println("true is not found in Boolean list");
        }

        System.out.println("Iterating Boolean list:");
        for (Boolean result : results) {
            System.out.println(result);
        }

        Collections.sort(results);
        System.out.println("Boolean list after sorting: " + results);
    }
}
