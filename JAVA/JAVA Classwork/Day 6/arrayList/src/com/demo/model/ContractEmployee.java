package com.demo.model;

public class ContractEmployee extends Employee {
	private float hrs;
	private double charges;
	
	public ContractEmployee() {
		System.out.println("In contractEmplyee");
	}
	
	public ContractEmployee(int id, String nm, String mob, String desg, String dept,float hrs, double charges ) {
		super(id,nm, mob, dept, desg);
		this.hrs = hrs;
		this.charges = charges;
	}

	public float getHrs() {
		return hrs;
	}

	public void setHrs(float hrs) {
		this.hrs = hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	

	@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		System.out.println("In ContractEmp calculateSal");
		return hrs*charges;
	}

	@Override
	public String toString() {
		return "ContractEmployee [hrs=" + hrs + ", charges=" + charges + ", toString()=" + super.toString() + "]";
	}
	
	
}
