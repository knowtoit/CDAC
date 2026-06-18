package com.demo.model;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String mobNo;
	private float sal;
	private String dept;
	private String desg;
	
	

	public Employee() {
		super();
	}
	
	

	public Employee(int id, String name, String mobNo, float sal, String dept, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.mobNo = mobNo;
		this.sal = sal;
		this.dept = dept;
		this.desg = desg;
	}


	

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



	public String getMobNo() {
		return mobNo;
	}



	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}



	public float getSal() {
		return sal;
	}



	public void setSal(float sal) {
		this.sal = sal;
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


	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobNo=" + mobNo + ", sal=" + sal + ", dept=" + dept
				+ ", desg=" + desg + "]";
	}



	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.id, o.id);
	}

}
