package com.demo;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string");
		String str = sc.nextLine();
		
		String result = PalindromeString.palindromeSubString(str);
		
		System.out.println("Longest palindrome substring is: " + result);
		
		sc.close();

	}

}
