package com.demo;

//Que 2.Use different methods of java defined wrapper classes.

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Integer methods
        int n = Integer.parseInt("100");   // String to int
        Integer obj = Integer.valueOf("200"); // String to Integer
        String s = Integer.toString(n);   // int to String
        int cmp = Integer.compare(10, 20); // comparison

        // Double methods
        double d = Double.parseDouble("10.5");
        boolean checkNaN = Double.isNaN(d);

        // Character methods
        char ch = 'A';
        boolean isLetter = Character.isLetter(ch);
        char lower = Character.toLowerCase(ch);

        // Boolean methods
        boolean b = Boolean.parseBoolean("true");

        // Output
        System.out.println("Integer: " + n + ", " + obj + ", " + s + ", " + cmp);
        System.out.println("Double: " + d + ", isNaN: " + checkNaN);
        System.out.println("Character: " + isLetter + ", " + lower);
        System.out.println("Boolean: " + b);
	}

}
