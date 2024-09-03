package java8.sreamapi.practice;

import java.util.*;
public class Main {
	private Scanner sc;
	private EmployeeService empservice;
	public Main()
	{
		sc=new Scanner(System.in);
		empservice=new EmployeeService();
	}
	public void menu()
	{
		String choice="y";
		while(choice.equals("y"))
		{
	System.out.println("1. Search By dearptment");
	System.out.println("2. Sorting Employee Data");
	System.out.println("3. Maximum Salary");
	System.out.println("4. average salary");
	System.out.println("5. Calculating bonus");
	System.out.println("6. Insert employees");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
			System.out.println("Enter the department name ");
			empservice.searchByDepartment(sc.next());
	case 2:
			empservice.employeeSort();
			break;
	case 3:
		empservice.maxSalary();
			break;
	case 4:
		empservice.averageSalary();
			break;
	case 5:
		empservice.calculateBonus();
			break;
	case 6:
			empservice.insert();
			break;
	default:
	}
		System.out.println("Do u want to continue");
		choice=sc.next();
		}
		
	}
	public static void main(String[] args) {
		Main mainobj=new Main();;
		mainobj.menu();
		
	}
}
