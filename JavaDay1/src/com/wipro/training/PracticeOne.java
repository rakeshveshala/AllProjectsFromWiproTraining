package com.wipro.training;
import java.util.*;
public class PracticeOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter UserName: ");
		String userName = sc.next();
		System.out.println("enter Password: ");
		String password = sc.next();
		if(userName.equals("admin") && password.equals("admin")) {
			System.out.println("VALID");
		}
		else {
			System.out.println("INVALID");
		}
	}
}