package com.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class StringVector {
	public static Vector<String> findUppercaseString(Vector<String>inputList){
		Vector<String> list2 = new Vector<>();
		
		for(String str: inputList) {
			if(!str.isEmpty() && str.equals(str.toUpperCase())) {
				list2.add(str);
			}
		}
		
		return list2;
	}
	
	
	public static Vector<String> stringEndsWithVowel(Vector<String> inputList){
		Vector<String> list3 = new Vector<>();
		
		for(String str:inputList) {
			if(!str.isEmpty()) {
				char lastChar = Character.toLowerCase(str.charAt(str.length()-1));
				
				if(lastChar == 'a' || lastChar=='e' || lastChar=='i' || lastChar=='o' || lastChar=='u') {
					list3.add(str);
				}
			}
		}
		
		return list3;
	}
	
	public static void displayList(String title, Vector<String> list) {
		System.out.println(title);
		
		for(String str:list) {
			System.out.println(str);
		}
	}
	
	
	
	public static void writToFile(Vector<String> list, String fileName) {
		try(BufferedWriter writer= new BufferedWriter(new FileWriter(fileName))){
			for(String str:list) {
				writer.write(str);
				writer.newLine();
			}
			System.out.println("data written to" + fileName);
		}
		catch(IOException e) {
			System.out.println("Error written to" + fileName);
		}
	}
}
