package mypackage.SpringAOP;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.*;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext cont=new ClassPathXmlApplicationContext("Beans.xml");
    	MyService serviceobj=(MyService)cont.getBean("myservice"); 
    	serviceobj.insert();
    	serviceobj.message1();
    	serviceobj.message2();
    	try {
			serviceobj.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
