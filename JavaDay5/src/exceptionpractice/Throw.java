package exceptionpractice;

import java.util.Scanner;
//CHECKED EXCEPTION
public class Throw {
	Scanner sc;
	int age;
	public Throw() {
		sc=new Scanner(System.in);
		System.out.println("enter age:");
		age=sc.nextInt();
	}
	public void check() throws ClassNotFoundException{
		if(age<18) {
			throw new ClassNotFoundException("AGE LESS THAN 18");
		}
	}
	public static void main(String[] args) {
		Throw obj = new Throw();
		try {
			obj.check();
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
//UNCHECKED EXCEPTION
//package exceptionpractice;
//
//import java.util.Scanner;
//
//public class Throw {
//	Scanner sc;
//	int age;
//	public Throw() {
//		sc=new Scanner(System.in);
//		System.out.println("enter age:");
//		age=sc.nextInt();
//	}
//	public void check() {
//		if(age<18) {
//			throw new ArithmeticException();
//		}
//	}
//	public static void main(String[] args) {
//		Throw obj = new Throw();
//		obj.check();
//	}
//
//}