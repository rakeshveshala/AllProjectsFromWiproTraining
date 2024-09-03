package mypackage.SpringCoreAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeptConfiguration { 
	@Bean(name="employee1")
	public Employee getEmployee () {
		Employee e1=new Employee(); 
		e1.setEmpid(1); 
		e1.setEmpname ("Abc"); 
		e1.setSalary (90000);
		return e1;
	}
	@Bean(name="employee2")
	public Employee getEmployee2 () {
		Employee e2=new Employee(); 
		e2.setEmpid(2); 
		e2.setEmpname ("Varun"); 
		e2.setSalary(80000);
		return e2;
	}
	@Bean(name="department1")
	public Department getDept1 () {
		Department d=new Department();
		d.setDeptcode (1001);
		d.setDeptname("HR"); d.setEmplist (null);
		return d;
		}
}
