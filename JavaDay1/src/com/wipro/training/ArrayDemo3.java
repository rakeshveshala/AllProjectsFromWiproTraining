package com.wipro.training;
import java.util.*;
public class ArrayDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr3[] = new int[5];
		int sum=0;
		for(int i=0;i<arr3.length;i++) {
			System.out.println("Enter the numbers to sum: ");
			arr3[i] = sc.nextInt();
		}
		for(int i=0;i<arr3.length;i++) {
			sum = sum+arr3[i];
		}
		System.out.println("the sum is:"+sum);
		
	}
}
