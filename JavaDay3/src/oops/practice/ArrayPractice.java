package oops.practice;
import java.util.*;
public class ArrayPractice {
	private int[] arr=new int[4];
	private double total;
	private double avg;
	private Scanner sc;
	public ArrayPractice() {
		sc=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();		}
	}
	public void total() {
		for(double i:arr) {
			total=total+i;
		}
		System.out.println("the total is: "+total);
	}
	public void avg() {
		avg = total/arr.length;
		
		System.out.println("the Average is:"+avg);
	}
	public static void main(String[] args) {
		ArrayPractice obj = new ArrayPractice();
		obj.total();
		obj.avg();
	}
}
