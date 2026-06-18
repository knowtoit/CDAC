package com.demo;


public class Employee {

	private int id;
	private String name;
	private String mob;
	private String dept;
	private String desg;
	private double sal;
	private double bonus;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMob() {
		return mob;
	}


	public void setMob(String mob) {
		this.mob = mob;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getDesg() {
		return desg;
	}


	public void setDesg(String desg) {
		this.desg = desg;
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


	public Employee(int id, String name, String mob, String dept, String desg, double sal, double bonus) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.dept = dept;
		this.desg = desg;
		this.sal = sal;
		this.bonus = bonus;
	}


	

}

class testEmployee{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(0, null, null, null, null, 0, 0);
		
		e.setId(1);
		e.setName("Deepa");
		e.setSal(90000);
		
		System.out.println(e.getId());
		
		
		
		
		
		
		

	}
}
