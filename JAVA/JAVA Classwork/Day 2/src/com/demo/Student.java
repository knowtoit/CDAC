package com.demo;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
	private int sid;
	private String sname;
	private float m1;
	private float m2;
	private float m3;
	private Date jdate;
	
	
	public Student() {
		sid = 0;
		sname = null;
		m1 = 0f;
		m2 = 0f;
		m3 = 0f;
		jdate = null;
	}
	
	public Student(int id, String s, float m1, float m2, float m3, Date jdt) {
		sid = id;
		sname = s;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		jdate = jdt;		
	}
	
	public void setSid(int s) {
		sid = s;
	}
	
	public int getSid() {
		return sid;
	}
	
	public void setSname(String s) {
		sname = s;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setM1(float m) {
	     m1 = m;
	}
	
	public float getM1() {
		return m1;
	}
	
	public void setM2(float m) {
	     m2 = m;
	}
	
	public float getM2() {
		return m2;
	}
	
	public void setdate(Date s) {
		jdate = s;
	}
	
	public Date getDate() {
		return jdate;
	}
	
//	public void display() {
//		System.out.println("id = " + sid);
//		System.out.println("Name = " + sname);
//		System.out.println("m1 ="+ m1);
//		System.out.println("m2=" + m2);
//		System.out.println("m3=" + m3);
//		System.out.println("Date:" + jdate);
//	}   Do not use display()
//  Use ToString() method instead
	
	public String toString() {
		System.out.println("In student toString method");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String str = sdf.format(jdate);
		return ("Id: "+sid +"Name:"+ sname+ "m1:"+ m1 + "m2:" + m2 +"m3:"+ m3 + "Date:"+ str);
		
	}
	
}
