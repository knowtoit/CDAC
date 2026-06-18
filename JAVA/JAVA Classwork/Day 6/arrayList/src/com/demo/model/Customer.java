package com.demo.model;

public class Customer extends Person {
	private float bill;
	
	public Customer() {
		System.out.println("In Customer default constructor");
	}
	
	public Customer(int id, String nm, String mob, float bill) {
		super(id, nm, mob);
		System.out.println("In customer parameterized constructor");
		this.bill = bill;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Customer [bill=" + bill + ", toString()=" + super.toString() + "]";
	}
	
	
}
