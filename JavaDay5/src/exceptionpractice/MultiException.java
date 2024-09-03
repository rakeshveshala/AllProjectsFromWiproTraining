package exceptionpractice;

import java.util.Scanner;

public class MultiException {
	private Scanner sc2;
	private int arr[];
	public MultiException() {
		sc2=new Scanner(System.in);
		arr=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc2.nextInt();
		}
		try {
			//System.out.println(7/0);
			for(int i=0;i<6;i++) {
				System.out.println(arr[i]);
			}
		}
		
		catch(ArrayIndexOutOfBoundsException ex){
			
			System.out.println("array bounds error");
		}
		catch(ArithmeticException ex) {
			System.out.println("you are deviding with zero");
		}
		catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		MultiException obj3=new MultiException();
	}

}