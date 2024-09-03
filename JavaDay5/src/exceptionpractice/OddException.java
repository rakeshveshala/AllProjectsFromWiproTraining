package exceptionpractice;

import java.util.Scanner;

public class OddException {
	Scanner sc;
	int number;
	public OddException() {
		sc=new Scanner(System.in);
		System.out.println("enter number:");
		number=sc.nextInt();
	}
	public void check() {
		if(number%2!=0) {
			throw new ArithmeticException();
		}
	}
	public static void main(String[] args) {
		OddException obj = new OddException();
		obj.check();
	}

}