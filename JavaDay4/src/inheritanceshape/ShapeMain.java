package inheritanceshape;

import java.util.Scanner;

public class ShapeMain {
	private static Scanner sn;
	public static void main(String[] args) {
		Shape obj;
		sn = new Scanner(System.in);
		obj = new Circle();
		for(int i=0;i<3;i++) {
			System.out.println("enter 1 for area , 2 for perimeter , 3 for getType of shape");
			int n=sn.nextInt();
			if(n==1) {
				System.out.println("Area is: "+obj.getArea());
			}
			else if(n==2) {
				System.out.println("Perimeter is: "+obj.getPerimeter());
			}
			else if(n==3) {
				System.out.println("Type of shape is: "+obj.getType());
			}
		}
		
		obj = new Rectangle();
		for(int i=0;i<3;i++) {
			System.out.println("enter 1 area , 2 for perimeter , 3 for getType of shape");
			int n=sn.nextInt();
			if(n==1) {
				System.out.println("Area is: "+obj.getArea());
			}
			else if(n==2) {
				System.out.println("Perimeter is: "+obj.getPerimeter());
			}
			else if(n==3) {
				System.out.println("Type of shape is: "+obj.getType());
			}
		}
	}

}
