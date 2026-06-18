package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		
		System.out.println("How many string you wanna enter?");
		int n= sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter string");
		for(int i=0; i<n; i++) {
			String input= sc.nextLine();
			list.add(input);
		}
		
		ArrayList<String> list2 = StringPalindrome.startingWithConsonant(list);
		ArrayList<String> list3 = StringPalindrome.isPalindrome(list);
		
		System.out.println("Strin with consonant");
		StringPalindrome.displayList("", list2);
		
		
		System.out.println("Palindrome string:");
		StringPalindrome.displayList("", list3);
		
		
		StringPalindrome.writeListoFle(list2, "consonant.text");
		StringPalindrome.writeListoFle(list3, "palindrome.txt");
		
		sc.close();

	}

}
