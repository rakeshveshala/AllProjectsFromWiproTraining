package com.wipro.training;
import java.util.*;
public class BufferStringPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String str = sc.nextLine();
//		StringBuffer result = new StringBuffer(str);
//		System.out.println(result.insert(2, "ZZ"));
//		StringBuffer result = new StringBuffer(str);
//		System.out.println(result.deleteCharAt(3));
		StringBuffer result = new StringBuffer(str);
		System.out.println(result.lastIndexOf("hi"));
	}
}
