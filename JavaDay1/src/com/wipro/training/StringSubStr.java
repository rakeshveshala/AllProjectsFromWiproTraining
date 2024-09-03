package com.wipro.training;
import java.util.*;
public class StringSubStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String str = sc.nextLine();
		System.out.println("enter substring: ");
		String subStr = sc.nextLine();
		if(str.indexOf(subStr) != -1) {
			System.out.println("YES! it is present");
			System.out.println("INDEX IS: "+str.indexOf(subStr));
		}
		else {
			System.out.println("NOT PRESENT");
		}
	}
}