package com.demo;

import java.util.Scanner;
import java.util.Vector;

public class TestStringVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<String> list= new Vector<>();
		
		System.out.println("How many string you wanna enter?");
		int n=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter sring");
		for(int i=0; i<n; i++) {
			String input = sc.nextLine();
			list.add(input);
		}
		
		Vector<String> list2 = StringVector.findUppercaseString(list);
		Vector<String> list3 = StringVector.stringEndsWithVowel(list);
		
		System.out.println("Uppercase string:");
		StringVector.displayList("", list2);
		
		System.out.println("Ending with vowels");
		StringVector.displayList("", list3);
		
		StringVector.writToFile(list2, "upper.txt");
		StringVector.writToFile(list3, "vowel.text");
		
		sc.close();

	}

}
