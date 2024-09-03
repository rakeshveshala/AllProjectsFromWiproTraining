package java8.sreamapi.practice;
import java.util.*;
public class EmployeeService {
	
	private List<Employee> emplist; //creating Employee List
	private Scanner sc;
	public EmployeeService(){
		emplist = new LinkedList<>();
		sc=new Scanner(System.in);
	}
	public void insert() {
		System.out.println("Enter how many employees do you want:");
		int noofemployees=sc.nextInt();
		for(int i=0;i<noofemployees;i++) {
			Employee e=new Employee();
			System.out.println("Enter employee id:");
			e.setEmpid(sc.nextInt());
			System.out.println("Enter employee name:");
			e.setEmpname(sc.next());
			System.out.println("Enter employee department:");
			e.setDepartment(sc.next());
			System.out.println("Enter employee qualification:");
			e.setQualification(sc.next());
			emplist.add(e);
		}
	}
	public void searchByDepartment(String department) {
		emplist.stream().filter(e->e.getDepartment().equalsIgnoreCase(department)).forEach(e->{
			System.out.println("Employee name is: "+e.getEmpname());
		});
	}
	public void employeeSort() {
		emplist.stream().sorted((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary())).forEach(e->{
			System.out.println(e.getEmpname()+" "+e.getDepartment());
		});
	}
	public void averageSalary() {
		double averageSalary=emplist.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println(averageSalary);
	}
	public void maxSalary() {
		Employee maxSalary=emplist.stream().max((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).orElse(null);
		System.out.println("Name of the employee and max salary:"+maxSalary.getEmpname()+" "+maxSalary.getSalary());
	}
	public void calculateBonus() {
		List<Double> bonusList= emplist.stream().map(e->e.getSalary()*0.10).toList();
		bonusList.forEach(e->{
			System.out.println(e);
		});
	}
	

}
