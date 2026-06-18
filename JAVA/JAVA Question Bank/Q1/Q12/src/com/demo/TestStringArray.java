package com.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<String> list1 = new ArrayList<>();

	        System.out.print("How many strings do you want to enter? ");
	        int n = scanner.nextInt();
	        scanner.nextLine();

	        System.out.println("Enter the strings:");
	        for (int i = 0; i < n; i++) {
	            String input = scanner.nextLine();
	            list1.add(input);
	        }

	        ArrayList<String> list2 = StringArray.findStringsContainingJava(list1);
	        ArrayList<String> list3 = StringArray.findUppercaseStrings(list1);

	        System.out.println("\nStrings containing substring \"java\":");
	        StringArray.displayList("", list2);

	        System.out.println("\nUppercase strings:");
	        StringArray.displayList("", list3);

	        StringArray.writeListToFile(list2, "java.txt");
	        StringArray.writeListToFile(list3, "upper.txt");

	        scanner.close();

	}

}
