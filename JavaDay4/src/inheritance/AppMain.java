package inheritance;

public class AppMain {

	public static void main(String[] args) {
		Employee emp;
		emp = new EmployeeMain();
		System.out.println("for permanent employee");
		emp.accept();
		emp.calculateSalary();
		emp.display();
		emp = new TempEmployee();
		System.out.println("for permanent employee");
		emp.accept();
		emp.calculateSalary();
		emp.display();
	}

}
