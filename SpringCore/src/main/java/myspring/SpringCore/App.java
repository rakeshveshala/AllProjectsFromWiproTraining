package myspring.SpringCore;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.*;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		//Mam told
//		ApplicationContext cont=new ClassPathXmlApplicationContext("Beans.xml"); 
//		Employee eobj=(Employee)cont.getBean("employee2");
//		System.out.println("Employee id is "+eobj.getEmpid());
//		System.out.println("Employee Name is "+eobj.getEmpname());
//		System.out.println("Employee Salary is "+eobj.getSalary());
//
//		Employee eobj1=(Employee)cont.getBean("employee3");
//		System.out.println("Employee id is "+eobj1.getEmpid());
//		System.out.println("Employee Name is "+eobj1.getEmpname());
//		System.out.println("Employee Salary is "+eobj1.getSalary());
		
		//for practice student class
//		ApplicationContext cont=new ClassPathXmlApplicationContext("BeansStudent.xml");
//		Student obj = (Student)cont.getBean("student1");
//		System.out.println("Student id is "+obj.getStudentId());
//		System.out.println("Student Name is "+obj.getStudentName());
//		System.out.println("Student mobile number is "+obj.getMobileNo());
//		System.out.println("Student score is "+obj.getScore());
//		
//		Student obj1 = (Student)cont.getBean("student3");
//		System.out.println("Student id is "+obj1.getStudentId());
//		System.out.println("Student Name is "+obj1.getStudentName());
//		System.out.println("Student mobile number is "+obj1.getMobileNo());
//		System.out.println("Student score is "+obj1.getScore());
		
		//assigning one object to other
		ApplicationContext cont=new ClassPathXmlApplicationContext("Beans.xml");
		Department d=(Department)cont.getBean("dept1");
		System.out.println("Department name is "+d.getDeptname());
		System.out.println("City is "+d.getCity()); 
		Employee obj=d.getEmp();
		System.out.println("Employee name is "+obj.getEmpname());
		//assigning student object in college
//		ApplicationContext cont=new ClassPathXmlApplicationContext("BeansStudent.xml");
//		College col = (College)cont.getBean("college1");
//		System.out.println("college code is "+col.getCollegeCode());
//		System.out.println("college Name is "+col.getCollegeName());
//		System.out.println("college city is "+col.getCity());
//		Student st = col.getStd();
//		System.out.println("student name  is "+st.getStudentName());
	}
}
