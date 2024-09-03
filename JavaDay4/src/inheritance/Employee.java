package inheritance;
import java.util.*;
public abstract class Employee {
	private int empid;
	private String empname;
	public int salary;
	protected Scanner sc;

	public abstract void calculateSalary();
	public void accept() {
		System.out.println("Enter name");
		empname=sc.next();
		System.out.println("Enter salary");
		salary=sc.nextInt();
		System.out.println("Enter id");
		empid=sc.nextInt();
	
	}
	public void display() {
		System.out.println("empid "+empid);
		System.out.println("empname "+empname);
		
	}
}