//Que 3. Create String Demo class and perform different string manipulation
//methods.

package com.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Hello World";

	        // Length of string
	        System.out.println("Length: " + str.length());

	        // Convert to uppercase
	        System.out.println("Uppercase: " + str.toUpperCase());

	        // Convert to lowercase
	        System.out.println("Lowercase: " + str.toLowerCase());

	        // Character at index
	        System.out.println("Character at index 1: " + str.charAt(1));

	        // Substring
	        System.out.println("Substring (0-5): " + str.substring(0, 5));

	        // Replace characters
	        System.out.println("Replace: " + str.replace("World", "Java"));

	        // Check equality
	        System.out.println("Equals: " + str.equals("Hello World"));

	        // Compare strings
	        System.out.println("Compare: " + str.compareTo("Hello"));

	        // Trim spaces
	        String str2 = "  Java  ";
	        System.out.println("Trim: " + str2.trim());

	        // Contains
	        System.out.println("Contains 'World': " + str.contains("World"));

	}

}
