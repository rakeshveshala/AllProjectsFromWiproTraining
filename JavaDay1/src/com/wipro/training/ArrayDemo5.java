package com.wipro.training;
import java.util.*;
public class ArrayDemo5 {
	public static void main(String[] args) {
		int even=0;
		int odd=0;
		int arr5[] = {1,2,5,4,6,7};
		for(int i=0;i<arr5.length;i++) {
			if(arr5[i]%2==0) {
				even = even+1;
			}
			else{
				odd=odd+1;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}