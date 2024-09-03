package exceptionpractice;

import java.util.Scanner;

public class ArrayOutof {
	private Scanner sc2;
	private int arr[];
	public ArrayOutof() {
		sc2=new Scanner(System.in);
		arr=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc2.nextInt();
		}
		try {
			for(int i=0;i<6;i++) {
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException ex){
			
			System.out.println("array bounds error");
		}
	}
	public static void main(String[] args) {
		ArrayOutof obj3=new ArrayOutof();
	}

}
