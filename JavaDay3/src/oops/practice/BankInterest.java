package oops.practice;
import java.util.*;
public class BankInterest {
	private Scanner sc;
	private int amount;
	private double interestRate;
	public void accept() {
		sc=new Scanner(System.in);
		System.out.println("enter amount: ");
		amount = sc.nextInt();
		System.out.println("enter interestRate: ");
		interestRate = sc.nextDouble();
	}
	public void interest() {
		System.out.println("The interest is : "+(amount*interestRate));
	}
//	public static void main(String[] args) {
//		BankInterest obj = new BankInterest();
//		obj.accept();
//		obj.interest();
//	}
}