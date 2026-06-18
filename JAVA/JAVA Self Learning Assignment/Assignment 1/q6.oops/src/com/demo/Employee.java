//6. implement OOP principles Encapsulation, Abstraction, Inheritance and
//Polymorphism


package com.demo;

abstract class Employee {
	protected int id;
	protected String name;
	
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	
	abstract void calculateSal();
}
	
	class Developer extends Employee{
		// Encapsulation (private data)
	    private double salary;

	    public Developer(int id, String name, double salary) {
	        super(id, name);
	        this.salary = salary;
	    }

	    // Getter & Setter (Encapsulation)
	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Polymorphism (method overriding)
	    @Override
	    void calculateSal() {
	        System.out.println("Developer Salary: " + salary);
	    }

		
	}


	// Another child class
	  class Manager extends Employee {
	    private double salary;

	    public Manager(int id, String name, double salary) {
	        super(id, name);
	        this.salary = salary;
	    }

	    @Override
	    void calculateSal() {
	        System.out.println("Manager Salary: " + salary);
	    }

		
	}

//class OOPdemo{
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// Polymorphism (reference of parent, object of child)
//        Employee e1 = new Developer(1, "Sai", 80000);
//        Employee e2 = new Manager(2, "Deepa", 100000);
//
//        e1.calculateSal();
//        e2.calculateSal();
//
//	}
//}
