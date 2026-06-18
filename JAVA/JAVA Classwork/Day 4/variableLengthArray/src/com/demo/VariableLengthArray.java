package com.demo;
import java.util.stream.Stream;

public class VariableLengthArray {
	public static void main(String[] args) {
		int [][] arr2 = new int[3][];
		ArrayVariableService.acceptData(arr2);
		ArrayVariableService.displayData(arr2);
		
		int[] arr = ArrayVariableService.findMinRowWise(arr2);
		//java 1.5
		for(int i=0; i<arr.length; i++) {
			System.out.println("Minimum of" + i + "th row -->" + arr[i]);
		}
		
		//java 1.7
		for(int num:arr) {
			System.out.println("Minimum of row -->" + num);
		}
		
		//java 1.8
		Stream.of(arr).forEach(num -> System.out.println("Minimum of row -->" + num));
		
		arr= ArrayVariableService.findMinColumnWise(arr2);
		//java 1.5 
   	 for(int i=0;i<arr.length;i++) {
   		 System.out.println("Minimum of" +i+"th row --->" +arr[i]);
   	 }
   	 //java 1.7
   	 for(int num:arr) {  //{12,3,4}
   		 System.out.println("Minimum is --->"+num);
   	 }
   	 //java 1.8
   	 Stream.of(arr).forEach(num->System.out.println("Minimum  --->"+num));
    }
	}
}
