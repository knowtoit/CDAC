package com.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class StringPalindrome {
	public static ArrayList<String> startingWithConsonant(ArrayList<String> inputList){
		ArrayList<String> list2 = new ArrayList<>();
		
		for(String str:inputList) {
			if(!str.isEmpty()) {
				char firstChar = Character.toLowerCase(str.charAt(0));
				
				if(Character.isLetter(firstChar) && firstChar != 'a' && firstChar != 'e' && firstChar!='i' && firstChar !='o' && firstChar !='u') {
					list2.add(str);
				}
			}
		}
		
		return list2;
	}
	
	
	public static ArrayList<String> isPalindrome(ArrayList<String> inputList){
		ArrayList<String> list3 = new ArrayList<>();
		
		for(String str:inputList) {
			if(isStringPalindrome(str)) {
				list3.add(str);
			}
		}		
		
		return list3;
	}
	
	public static boolean isStringPalindrome(String s) {
		String lowerStr = s.toLowerCase();
		int left=0;
		int right=lowerStr.length()-1;
		
		while(left<right) {
			if(lowerStr.charAt(left) != lowerStr.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		
		return true;
	}
	
	
	
	public static void displayList(String title, ArrayList<String> list) {
		System.out.println(title);
		
		for(String str:list) {
			System.out.println(str);
		}
	}
	
	public static void writeListoFle(ArrayList<String> list, String fileName) {
		try(BufferedWriter writer= new BufferedWriter(new FileWriter(fileName))){
			for(String str:list) {
				writer.write(str);
				writer.newLine();
			}
			System.out.println("Data written" + fileName);
		}
		catch(IOException e) {
			System.out.println("Error " + fileName);
		}
	}
}
