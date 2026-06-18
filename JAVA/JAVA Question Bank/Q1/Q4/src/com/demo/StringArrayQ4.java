package com.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StringArrayQ4 {
	public static ArrayList<String> findLength(ArrayList<String> inputList){
		
		ArrayList<String> list2 = new ArrayList<>();
		
		for(String str:inputList) {
			if(str.length() < 4) {
				list2.add(str);
			}
		}
		
		return list2;
	}
	
	public static ArrayList<String> findStrContainingDigit(ArrayList<String> inputList){
		ArrayList<String> list3 = new ArrayList<>();
		
		for(String str: inputList) {
			boolean hasDigit = false;
			
			for(int i=0; i<str.length();i++) {
				if(Character.isDigit(str.charAt(i))) {
					hasDigit = true;
					break;
				}
			}
			
			if(hasDigit) {
				list3.add(str);
			}
		}
		
		return list3;

	}
	
	
	public static void displayList(String title, ArrayList<String> list) {
		System.out.println(title);
		
		for(String str:list) {
			System.out.println(str);
		}
		
		}
	
	public static void writeToFile(ArrayList<String> list, String fileName) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
			for(String str:list) {
				writer.write(str);
				writer.newLine();
			}
			System.out.println("Data written to" + fileName);
		}
		catch(IOException e) {
			System.out.println("Error writing to" + fileName);
		}
	}
}

