//Que 1. Create sample classes to understand boxing & unboxing.

package com.demo;

public class BoxingUnboxing {
	public static void main(String []args ) {
		Integer intbox1, intbox2, intbox3;
		intbox1 = 250;
		int a = intbox1;
		System.out.println("The value of intbox1 is " + intbox1);
		System.out.println("The value of int1 is" + a);
		intbox2 = 500;
		System.out.println("Value of intbox2 is " + intbox2);
		intbox2 = intbox2+1;
		System.out.println("Value of intbox2 after increment is " + intbox2);
		intbox3 = intbox2+(intbox2/5);
		System.out.println("Value of intbox3 after evaluation is " + intbox3);
		Boolean bbox1 = true;
		if(bbox1) 
			System.out.println("bbox1 contains true value ");
		Character chbox1 = 'H';
		char chbox2 = chbox1;
		System.out.println("Value of chbox2 is " + chbox2);
		Integer intbox4 = Autobox2.mthdbox(500);
		System.out.println("The value obtained from the method is " + intbox4);
		
	}
	
}

class Autobox2{
	static int mthdbox(Integer b) {
		return b;
	}
}
