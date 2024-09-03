package com.wipro.training;
import java.util.*;
public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eId= 0;
		double eSalary= 0.0;
		String eName= null;
		System.out.println("enter id: ");
		eId = sc.nextInt();
		System.out.println("enter salary: ");
		eSalary = sc.nextDouble();
		System.out.println("enter name: ");
		eName = sc.next();
		System.out.println(eId +" "+eSalary+" "+eName);
	}
}
