package com.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StringArrayQ2 {
	public static ArrayList<String> findLength(ArrayList<String> inputList){
		ArrayList<String> list2 = new ArrayList<>();
		
		for(String str : inputList) {
			if(str.length()>5) {
				list2.add(str);
			}
		}
		return list2;
		
	}
		public static ArrayList<String> findStartingVowels(ArrayList<String> inputList){
			
			ArrayList<String> list3 = new ArrayList<>();
			
			for(String str:inputList) {
				if(!str.isEmpty()) {
					char firstChar = Character.toLowerCase(str.charAt(0));
					
					if(firstChar == 'a' || firstChar == 'e' || firstChar=='i' || firstChar=='o' || firstChar=='u') {
						list3.add(str);
					}
				}
			}
			
			return list3;
		}
		
		
		public static void displayList(String title, ArrayList<String>List) {
			System.out.println(title);
			
			for(String str:List) {
				System.out.println(str);
			}
		}
		
		
		public static void writeToFile(ArrayList<String> List, String fileName) {
			try(BufferedWriter writer= new BufferedWriter(new FileWriter(fileName))){
				for(String str:List) {
					writer.write(str);
					writer.newLine();
				}
				System.out.println("Data written to" + fileName);
			}catch(IOException e) {
				System.out.println("Error writing to file" + fileName);
			}
		}
	
}
