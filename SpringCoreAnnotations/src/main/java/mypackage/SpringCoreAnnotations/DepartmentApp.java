package mypackage.SpringCoreAnnotations;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class DepartmentApp {
public static void main(String[] args) {
	AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext (DeptConfiguration.class); 
	Department d= (Department)cont.getBean ("department1");
	System.out.println("Department name is "+d.getDeptname());
	System.out.println("code is "+d.getDeptcode());
	List<Employee> elist=d.getEmplist();
	/*elist.forEach(e->
	System.out.println("Employee Name is "+e.getEmpname()); System.out.println("Salary is "+e.getSalary());
	);
	 */
	for (Employee e:elist){
		System.out.println("Name is "+e.getEmpname());
		System.out.println("Salary is "+e.getSalary());
	}
}
}