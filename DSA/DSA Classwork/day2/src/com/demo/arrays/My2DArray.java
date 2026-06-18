package com.demo.arrays;
import java.util.*;

public class My2DArray {
	public int[][] arr;
	
	public My2DArray() {
		arr = new int[3][3];
	}
	
	public My2DArray(int row, int col) {
		arr = new int[row][col];
	}
	
	public My2DArray(int[][] arr) {
		super();
		this.arr=arr;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter row values" + i + "Enter column values" + j);
				arr[i][j] = sc.nextInt();
			}
		}
		
	}
	
	
	public void displayData() {
		for(int i=0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + "\t");
			}
		}
	}
	
	
	
	//Find sum rowwise
	public int[] findSumRowwise() {
		int[] sum = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			sum[i]=0;
			for(int j=0; j<arr[i].length; j++) {
				sum[i] += arr[i][j];
			}
		}
		return sum;
	}
	
	
	//Find sum columnwise
	public int[] findSumColumnwise() {
		int[] sum = new int[arr[0].length];
		for(int j=0; j<arr[0].length;j++) {
			sum[j]=0;
		for(int i=0; i<arr.length; i++) {
			sum[j] += arr[i][j];
		}	
		}
		return sum;
	}
	
	//Add 2D Matrix
	public int[][] add2DArray(My2DArray ob){
		if((this.arr.length==ob.arr.length)&&(this.arr[0].length==ob.arr[0].length)) {
			int[][] sum = new int[arr.length][arr[0].length];
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					sum[i][j] = this.arr[i][j] + ob.arr[i][j];
				}
			}return sum;
		}
		return null;
	}
	
	
	//Subtract 2D matrix
	public int[][] sub2DArray(My2DArray ob){
		if((this.arr.length==ob.arr.length)&& (this.arr[0].length==ob.arr[0].length)) {
			int[][] subtract = new int[arr.length][arr[0].length];
			for(int i=0; i<arr.length;i++) {
				for(int j=0; j<arr[0].length;j++) {
					subtract[i][j] = this.arr[i][j] - ob.arr[i][j];
				}
			}
			return subtract;
		}
		return null;
	}
	
	public int[][] matrixMultiplication(My2DArray ob){
		//chech whether col of this.arr & rows of ob.arr are same
		   if(this.arr[0].length != ob.arr.length){
			   return null;
		   }
		   
			   //size will be rows of his and col of ob
			   int[][] result = new int[this.arr.length][ob.arr[0].length];
			   
		   for(int i=0; i<this.arr.length; i++) {
			   for(int j=0; j<ob.arr[0].length; j++) {
				   int sum=0;
				   for(int k=0; k<this.arr[0].length;k++) {
					   sum += this.arr[i][k] * ob.arr[k][j];
				   }
				  result[i][j] = sum;
			   }
		   }
		   return result;	
	}
	
	
	//Column rotation
	//flag=true .....rotate right
	//flag=false......rotate left
	
	public void columnRotate(boolean flag, int num) {
		if(flag) {
			//rotate right
			//copy last col in temp
			int[] temp= new int[this.arr.length];
			for(int i=0; i<this.arr.length;i++) {
				temp[i] = arr[i][arr[0].length-1];
			}
			for(int i=0; i<arr.length;i++) {
				for(int j=arr[0].length-2;j>0;j--) {
					arr[i][j+1] = arr[i][j];
				}
			}
			//copy temp col into 0th col
			for(int i=0; i<this.arr.length;i++) {
				arr[i][0]= temp[i];
			}
		}
		else {
			//rotate left
			for(int cnt=0;cnt<num;cnt++) {
				//rotate col left side one time
				//copy 1st col into temp
				int[] temp = new int[this.arr.length];
				for(int i=0; i<this.arr.length;i++) {
					temp[i] = arr[i][0];
				}
				//shift every col to left
				for(int i =0;i<arr.length;i++) {
					for(int j=1; j<arr[0].length;j++) {
						arr[i][j-1] = arr[i][j];
					}
				}
				//copy temp into last col
				
			}
		}
	}
}


























