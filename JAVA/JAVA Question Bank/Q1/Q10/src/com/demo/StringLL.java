package com.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class StringLL {
	public static LinkedList<String> sameStartEnd(LinkedList<String> inputList){
		LinkedList<String> list2 = new LinkedList<>();
		
		for(String str:inputList) {
			if(!str.isEmpty()) {
				char firstChar = Character.toLowerCase(str.charAt(0));
				char lastChar = Character.toLowerCase(str.charAt(str.length()-1));
				
				
				if(firstChar==lastChar) {
					list2.add(str);
				}
			}
			
			
		}
		
		return list2;
	}
	
	public static LinkedList<String> findOnlyDigits(LinkedList<String> inputList){
		LinkedList<String> list3 = new LinkedList<>();
		
		for(String str:inputList) {
			if(!str.isEmpty() && containsOnlyDigit(str)) {
				list3.add(str);
			}
		}
		
		
		return list3;
	}
	
	public static boolean containsOnlyDigit(String str) {
		
		for(int i=0; i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void displayList(String title, LinkedList<String>list) {
		System.out.println(title);
		
		for(String str:list) {
			System.out.println(str);
		}
	}
	
	
	public static void writeToFile(LinkedList<String> list, String fileName) {
		try(BufferedWriter writer= new BufferedWriter(new FileWriter(fileName))){
			for(String str:list) {
				writer.write(str);
				writer.newLine();
			}
			System.out.println("data written to " + fileName);
		}
		catch(IOException e) {
			System.out.println("Error written to:" + fileName);
		}
	}
}
