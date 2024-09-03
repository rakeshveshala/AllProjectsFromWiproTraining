package com.wipro.training;
import java.util.*; 
public class ArrayDemo6{
	public static void main(String[] args) {
		int min=Integer.MIN_VALUE;
		int arr6[] = {1,2,54,4,62223,7};
		for(int i=0;i<arr6.length;i++) {
			if(arr6[i]>min) {
				min=arr6[i];
			}
		}
		System.out.println("The maximum number is: "+min);
	}
}