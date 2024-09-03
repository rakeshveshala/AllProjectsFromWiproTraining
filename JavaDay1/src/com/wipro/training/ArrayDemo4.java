package com.wipro.training;
import java.util.*;
public class ArrayDemo4 {
	public static void main(String[] args) {
		int arr4[] = {1,45};
		for(int i=0;i<arr4.length;i++) {
			if(arr4[i]%2==0) {
				System.out.println("EVEN NUMBER");
			}
			else if(arr4[i]%2 != 0){
				System.out.println("ODD NUMBER");
			}
		}
	}
}
