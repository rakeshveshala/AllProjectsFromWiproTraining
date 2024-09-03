package oops.practice;
//import java.util.*;
public class ParamCons {
	private int num1,num2;
	public ParamCons() {
		num1=22;
		num2=23;
	}
	public ParamCons(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void displayDetails() {
		System.out.println(num1+" "+num2);
	}
	
	public static void main(String[] args) {
		ParamCons obj = new ParamCons();
		obj.displayDetails();
		ParamCons obj2 = new ParamCons(2222,9999);
		obj2.displayDetails();
	}
}