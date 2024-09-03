package inheritanceshape;

import java.util.Scanner;

public class Rectangle extends Shape {
	public Rectangle() {
		sc=new Scanner(System.in);
		System.out.println("enter the length:");
		length =sc.nextDouble();
		System.out.println("enter the width:");
		width=sc.nextDouble();
	}
	@Override
	public double getArea() {
		return (length*width);
	}
	@Override
	public double getPerimeter() {
		return (2*(length+width));
	}
	@Override
	public String getType() {
		return "Rectangle";
	}
//	public String toString() {
//		return ("type of shape "+getType()+" "+" Area = "+getArea()+" "+"Perimeter is: "+getPerimeter());
//    }
}
