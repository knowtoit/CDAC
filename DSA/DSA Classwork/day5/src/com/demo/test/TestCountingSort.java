package com.demo.test;

import java.util.Arrays;

import com.demo.sorting.CountingSortAlgorithm;

public class TestCountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,7,6,1,5,7,8,3,4,2};
		int[] arr1 = CountingSortAlgorithm.countingSort(arr);
		System.out.println(Arrays.toString(arr1));

	}

}
