package com.demo;

public class Strings {
    
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;
		String s3 = "Hello";
		String s4 = new String("Hello");
		 System.out.println(s1);
		 System.out.println(s1.hashCode());
		 s1 = "Welcome";
		System.out.println(s1.hashCode());
		
		System.out.println(s3 == s1);  // true because value is same
		
		System.out.println(s4 == s2);//false  because value is same but memory location is different
		System.out.println(s4.equals(s2)); //true because value is same 
		
		System.out.println(s1);
	}
	
	
	
}
