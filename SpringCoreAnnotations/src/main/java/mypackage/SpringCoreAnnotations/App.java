package mypackage.SpringCoreAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(StudentConfiguration.class);
//    		Student s=(Student)cont.getBean("student2");
//    		System.out.println("Student Name is "+s.getStudentName());
//    		System.out.println("Score is "+s.getScore());
    		
    		College col=(College)cont.getBean("college1");
    		System.out.println("College Name:"+col.getCollegename());
    		Student std=col.getStudentobj();
    		System.out.println("Student Name:"+std.getStudentName());
    		
    }
}
