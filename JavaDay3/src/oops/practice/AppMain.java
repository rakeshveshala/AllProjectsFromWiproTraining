package oops.practice;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1 for bankinterest class and 2 for employee class method");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			BankInterest obj = new BankInterest();
			obj.accept();
			obj.interest();
			break;
		case 2:
			Employee obj2 = new Employee();
			obj2.accept();
			obj2.sum();
			obj2.difference();
		}
	}

}
