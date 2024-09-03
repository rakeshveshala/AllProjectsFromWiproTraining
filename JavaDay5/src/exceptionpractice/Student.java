package exceptionpractice;

import java.util.Scanner;

public class Student {
	private int age;
	private Scanner sc;
	public Student() {
		sc=new Scanner(System.in);
	}
	public void checkAge() throws InvalidAgeException  {
		System.out.println("enter age: ");
		age = sc.nextInt();
		if(age<18) {
			throw new InvalidAgeException();
		}
	}
	public static void main(String[] args) {
		Student obj=new Student();
		try {
			obj.checkAge();
		}
		catch(InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
