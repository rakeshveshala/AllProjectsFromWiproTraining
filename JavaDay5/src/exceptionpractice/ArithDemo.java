package exceptionpractice;
import java.util.*;
public class ArithDemo {
	public Scanner sc;
	public double num1;
	public double num2;
	public double result;
	public ArithDemo() throws ArithmeticException {
		sc=new Scanner(System.in);
		System.out.println("enter num1");
		num1=sc.nextDouble();
		System.out.println("enter num2");
		num2=sc.nextDouble();
	try {
		double result=num1/num2;
		System.out.println(result);
	}
	catch(ArithmeticException ex) {
		System.out.println("you are deviding with zero");
	}
	}
	public static void main(String[] args) {
		ArithDemo obj=new ArithDemo();
	}
}
