package com.demo.model;

public class SalariedEmployee extends Employee {
	private double sal;
	private double bonus;
	
	public SalariedEmployee() {
		System.out.println("In salaried employee default constructor");
	}
	
	public SalariedEmployee(int id, String nm, String mob, String dept, String desg, double sal, double bonus) {
		super(id, nm, mob, dept, desg);
		this.sal = sal;
		this.bonus = sal*0.10;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [sal=" + sal + ", bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		System.out.println("In salariedEmp");
		
		return sal+0.10*sal+0.15*sal-0.08*sal+bonus;
	}

	

	public double calculateBonus(float perc) {
		 bonus=sal*perc;
		return Math.floor(bonus);
	}
	
	
}
