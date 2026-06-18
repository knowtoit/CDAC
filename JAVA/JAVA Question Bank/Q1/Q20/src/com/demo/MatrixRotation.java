package com.demo;

public class MatrixRotation {
	public static int[][] clockwiseRotation(int[][]matrix, int n){
		int[][] rotated = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0;j<n; j++){
				rotated[j][n-1-i] = matrix[i][j];
			}
		}
		
		
		return rotated;
	}
	
	public static void displayMatrix(int[][] matrix, int n) {
		System.out.println("Rotated matrix:");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println("");
		}
	}
}
