package exceptionpractice;

import java.util.Scanner;

public class Nullpointer {
	private Scanner sc2;
	int num3;
	public Nullpointer() {
		try {
			num3=sc2.nextInt();
			System.out.println(num3);
		}
		catch(NullPointerException ex) {
			System.out.println("Please initialize scanner object");
		}
	}
	public static void main(String[] args) {
		Nullpointer obj2=new Nullpointer();
	}

}
