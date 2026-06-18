package com.demo;

import java.util.Arrays;

public class InsertionSortAlgorithm {
	public static void insertionSortAscending(int[] arr) {
		for(int i=1; i<arr.length;i++) {
			//i is starting point of unsorted array and j is end point of sorted array
			int j=i-1;
			//copy the ith element in variable
			int key = arr[i];
			while((j>=0 && arr[j]>key)) {
				arr[j+1]=arr[j];
				j--;
			}
			//place the key at j
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
		}
	}
	
	public static void insertionSortDescending(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			//i is starting point of unsorted array and j is ending point of sorted array
			int j=i-1;
			//copy ith element in variable
			int key = arr[i];
			while(j>=0 && arr[j]<key) {
				arr[j+1] = arr[j];
				j--;
			}
			//place the key at j
			arr[j+1] = key;
			System.out.println(Arrays.toString(arr));
		}
	}

}
