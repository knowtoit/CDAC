package com.demo.model;

public class Vender extends Employee {
	private int empNum;
	private double charges;
	
	public Vender() {
		System.out.println("In vendor default constructor");
	}
	
	public Vender(int id, String nm, String mob, int empNum, double charges) {
		super(id,nm, mob);
		this.empNum = empNum;
		this.charges = charges;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	

	@Override
	public String toString() {
		return "Vender [empNum=" + empNum + ", charges=" + charges + ", toString()=" + super.getPid() +super.getPname()+ "]";
	}

	@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		System.out.println("In vendor calculatesal");
		return empNum*charges;
	}
	
}
