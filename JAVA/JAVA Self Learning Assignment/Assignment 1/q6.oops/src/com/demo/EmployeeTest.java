package com.demo;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Polymorphism (reference of parent, object of child)
        Employee e1 = new Developer(1, "Sai", 80000);
        Employee e2 = new Manager(2, "Deepa", 100000);

        e1.calculateSal();
        e2.calculateSal();

	}

}
