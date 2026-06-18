package com.demo;

import java.util.Scanner;

public class TestSubstringLongest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String input=sc.nextLine();
		
		int result = SubstringLongest.findLongestSubstring(input);
		
		System.out.println("Length of longest substring is" + result);
		
		sc.close();
	}

}
