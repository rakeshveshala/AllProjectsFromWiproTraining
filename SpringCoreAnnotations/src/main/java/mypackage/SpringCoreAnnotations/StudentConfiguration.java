package mypackage.SpringCoreAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {
	
	@Bean(name="student1")
	public Student getStudent (){
		Student s=new Student();
		s.setStudentId(1);
		s.setStudentName ("Naman");
		s.setScore (87);
		return s;
	}
	
	@Bean(name="student2")
	public Student getStudent1(){
		Student s1=new Student();
		s1.setStudentId (3);
		s1.setStudentName("Harshita");
		s1.setScore (89);
		return s1;
	}
	//for auto wired concept
	@Bean(name="college1")
	public College getCollege(){
		College s2=new College();
		s2.setCollegecode (1233);
		s2.setCollegename("IIT");
		s2.setCity("Hyderabad");
		return s2;
	}
}