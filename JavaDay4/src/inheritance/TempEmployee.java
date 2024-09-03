package inheritance;
import java.util.*;
public class TempEmployee extends Employee {
	private int empAmount;
	private int empPeriod;
	protected Scanner sc;
	public TempEmployee() {
		sc = new Scanner(System.in);
		System.out.println("hii");
	}
	public void calculateSalary() {
		double anualSalary = (empAmount*12);
		System.out.println("anual salary is "+anualSalary);
	}
	public void accept() {
		System.out.println("Enter contractAmount");
		empAmount=sc.nextInt();
		System.out.println("Enter contract period");
		empPeriod=sc.nextInt();
	}
	public void display() {
		System.out.println("contract amount "+empAmount);
		System.out.println("contract period "+empPeriod);
	}
}