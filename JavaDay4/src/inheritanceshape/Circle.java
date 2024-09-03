package inheritanceshape;

import java.util.Scanner;

public class Circle extends Shape {
	public Circle() {
		sc=new Scanner(System.in);
		System.out.println("enter the radius:");
		radius =sc.nextDouble();
	}
	@Override
	public double getArea() {
		return (2*3.14*radius);
	}
	@Override
	public double getPerimeter() {
		return (3.14*radius*radius);
	}
	@Override
	public String getType() {
		return "circle";
	}
//	public String toString() {
//		return ("type of shape "+getType()+" "+" Area = "+getArea()+" "+"Perimeter is: "+getPerimeter());
//    }
}