package com.demo.model;

public class Student {
	
	private int studid;
	private String name;
	private float m1;
	private float m2;
	private float m3;
	private float gpa;

	public Student() {
		super();
	}
	
	public Student(int studid, String name, float m1, float m2, float m3) {
		super();
		this.studid = studid;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
	}

	public Student(float gpa) {
		super();
		this.gpa = gpa;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getM1() {
		return m1;
	}

	public void setM1(float m1) {
		this.m1 = m1;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}

	public float getM3() {
		return m3;
	}

	public void setM3(float m3) {
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", gpa="
				+ gpa + ", toString()=" + super.toString() + "]";
	}

	
	
}
