package com.demo;

import java.util.LinkedList;
import java.util.Scanner;

public class TestStringLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> list = new LinkedList<>();
		
		System.out.println("How many str you wanna enter?");
		int n=sc.nextInt();
		
		System.out.println("Enter string");
		for(int i=0; i<n; i++) {
			String input= sc.nextLine();
			list.add(input);
		}
		
		LinkedList<String> list2 = StringLL.sameStartEnd(list);
		LinkedList<String> list3 = StringLL.findOnlyDigits(list);
		
		System.out.println("String with same start and end");
		StringLL.displayList("", list2);
		
		System.out.println("String containing digits");
		StringLL.displayList("", list3);
		
		
		StringLL.writeToFile(list2, "samechar.txt");
		StringLL.writeToFile(list3, "digits.txt");
		
		
		sc.close();

	}

}
