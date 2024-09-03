package com.wipro.training;
import java.util.*;
public class BufferString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String str = sc.nextLine();
		StringBuffer result = new StringBuffer();
		String words[] = str.split(",");
		for(int i=0;i<words.length;i++) {
			StringBuffer buffer = new StringBuffer(words[i]);
			result.append(" "+buffer.reverse());
		}
		System.out.println("Result is: "+result.toString().toLowerCase());
	}
}