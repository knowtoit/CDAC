package com.demo.model;
import java.util.*;

public abstract class Employee extends Person{
	private String dept;
	private String desg;
	
	public Employee() {
		System.out.println("In Employee default constructor");
	}
	
	public Employee(int id, String nm, String mob, String desg, String dept) {
		super(id, nm, mob);
		System.out.println("In Employee parameterized constructor");
		this.dept = dept;
		this.desg = desg;
	}
	
	public Employee(int id) {
		super(id);
	}
	
	

	public Employee(int id, String nm, String mob) {
		super(id, nm, mob);
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
	
	abstract public double calculateSal();

	@Override
	public String toString() {
		return super.toString()  + "Employee [dept=" + dept + ", desg=" + desg + "]";
	
	
	
}
}
