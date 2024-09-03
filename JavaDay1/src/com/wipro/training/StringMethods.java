package com.wipro.training;
import java.util.*;
public class StringMethods {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String str = sc.nextLine();
		System.out.println("enter 2nd string: ");
		String str2 = sc.nextLine();
		System.out.println("enter Substring: ");
		String subStr = sc.nextLine();
		System.out.println(str.lastIndexOf(subStr));
		System.out.println(str.substring(2));
		System.out.println(str.toLowerCase());
		System.out.println(str.concat(str2));
		System.out.println(str.charAt(5));
		
	}
}