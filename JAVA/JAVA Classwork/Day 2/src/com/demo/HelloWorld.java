package com.demo;

public class HelloWorld {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static float add(float a, float b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(30,40,50));
		System.out.println(add(20.80f, 50.70f));
	}
}
