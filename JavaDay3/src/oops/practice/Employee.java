package oops.practice;
import java.util.*;
public class Employee {
	private Scanner sc;
	private int num1;
	private int num2;
	public void accept() {
		sc=new Scanner(System.in);
		System.out.println("enter num1: ");
		num1 = sc.nextInt();
		System.out.println("enter num2: ");
		num2 = sc.nextInt();
	}
	public void sum() {
		System.out.println("the sum is: "+(num1+num2));
	}
	public void difference() {
		System.out.println("the difference is: "+(num1-num2));
	}
//	public static void main(String[] args) {
//		Employee obj = new Employee();
//		obj.accept();
//		obj.sum();
//		obj.difference();
//	}
}
