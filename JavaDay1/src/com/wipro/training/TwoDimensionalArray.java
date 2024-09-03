package com.wipro.training;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int arr[][]= {{10,12},{100,200},{1000,2000}};
//		arr[0][0]=121;
//		arr[0][1]=112;
//		arr[1][0]=212;
//		arr[1][1]=142;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
