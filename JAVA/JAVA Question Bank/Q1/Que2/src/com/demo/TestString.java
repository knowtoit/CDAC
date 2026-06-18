package com.demo;


import java.util.ArrayList;
import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<>();
		
		System.out.println("How many syrings you wanna enter?");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter strings");
		for(int i=0; i<n; i++) {
			String input = sc.nextLine();
			list1.add(input);
		}
		
		ArrayList<String> list2 = StringArrayQ2.findLength(list1);
		ArrayList<String> list3 = StringArrayQ2.findStartingVowels(list2);
		
		
		System.out.println("\n Stings greater than 5");
		StringArrayQ2.displayList("", list2);
		
		System.out.println("\n String starting with vowels");
		StringArrayQ2.displayList("", list3);
		
		
		StringArrayQ2.writeToFile(list2, "data1.txt");
		StringArrayQ2.writeToFile(list3, "data2.txt");
		
		sc.close();
	}

}
