package inheritance;
import java.util.*;
public class EmployeeMain extends Employee {
	public EmployeeMain() {
		//super(20);
		System.out.println("hello");
	}
	public void accept() {
		super.accept();
	}
	public void display() {
		super.display();
	}
	public void calculateSalary() {
		double anualSalary = (salary*12);
		System.out.println("anual salary is "+anualSalary);
	}
	public static void main(String[] args) {
		EmployeeMain obj=new EmployeeMain();
		obj.accept();
		obj.display();
	}
}