package com.demo;

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("Aishwarya" , "9898989898");
		System.out.println(p1);
		
		Person p2 = new Person("Tejal Katariya", "8989898989");
		System.out.println(p2);
		
		Person p3 = new Person();
		p3.setPname("Sai");
		p3.setmob("9090909090");
		System.out.println(p3);
	}
}
