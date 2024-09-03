package com.wipro.training;
import java.util.*;
public class ArrayDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr2[] = new int[5];
		for(int i=0;i<arr2.length;i++) {
			System.out.println("Enter number: ");
			arr2[i] = sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
	}
}
