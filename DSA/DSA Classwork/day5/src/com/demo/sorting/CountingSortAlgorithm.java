package com.demo.sorting;

import java.util.Arrays;

public class CountingSortAlgorithm {
	
	public static int[] countingSort(int[] arr) {
		//find max
		int maxnum = findMax(arr);
		
		//create a array of size max+1
		int[] countarr = new int[maxnum+1];
		//initialize array to 0
		for(int i=0; i<countarr.length; i++) {
			countarr[i]=0;
		}
		
		//find number of occurrences for each distinct number 
		
		for(int i=0; i<arr.length;i++) {
			int pos = arr[i];
			countarr[pos]++;
		}
		System.out.println("Array:" + Arrays.toString(arr));
		System.out.println("Count array:");
		System.out.println(Arrays.toString(countarr));
		
		//find cumulative sum 
		
		for(int i=1; i<countarr.length; i++) {
			countarr[i] = countarr[i] + countarr[i-1];
		}
		
		System.out.println("Cumulative sum array");
		System.out.println(Arrays.toString(countarr));
		
		int[] outputArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int pos = arr[i];
			countarr[pos] = countarr[pos] -1;
			int index = countarr[pos];
			outputArr[index] = arr[i];
		}
		return outputArr;
	}

	private static int findMax(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];
		for(int i=0;i<arr.length; i++) {
			if(max<arr[i]) {
				max= arr[i];
			}
		}
		return max;
	}
	
	
}
