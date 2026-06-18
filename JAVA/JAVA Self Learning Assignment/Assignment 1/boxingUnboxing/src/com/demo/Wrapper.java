//Que Boxing and unboxing

package com.demo;

public class Wrapper {
	public static void main(String[] args) {
		//boxing
		Integer intwrap = new Integer(250);
		Character chrwrap = new Character('H');
		
		//unboxing 
		int int1 = intwrap.intValue();
		char chr1 = chrwrap.charValue();
		System.out.println(int1 + "  " + intwrap);
		System.out.println(chr1 + "  " + chrwrap);
	}
}
