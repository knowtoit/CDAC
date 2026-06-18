package com.demo;

import java.util.Date;

public class TestStudent {
	public static void main(String[] args) {
		Student s = new Student(1, "Aishwarya", 90, 95, 98, new Date());
		
		s.toString();
		
		System.out.println(s);
		
		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("Teju");;
		s1.setM1(90);
		s1.setM2(95);
		s1.setdate(new Date());
		 
		System.out.println(s1);
		
	}
}
