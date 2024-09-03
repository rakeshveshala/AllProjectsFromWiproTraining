package oops.practice;
import java.util.*;
public class ConsDemo {
	private Scanner sc;
	private int num1,num2;
	public ConsDemo() {
		sc=new Scanner(System.in);
		System.out.println("this is constructor");
		System.out.println("enter num1: ");
		num1 = sc.nextInt();
		System.out.println("enter num2: ");
		num2 = sc.nextInt();
	}
	public ConsDemo(int x) {
		this();
	}
	public void sum() {
		System.out.println("the sum is: "+(num1+num2));
	}
	public void difference() {
		System.out.println("the difference is: "+(num1-num2));
	}
	public static void main(String[] args) {
		ConsDemo obj = new ConsDemo(5);
		obj.sum();
		obj.difference();
	}
}
