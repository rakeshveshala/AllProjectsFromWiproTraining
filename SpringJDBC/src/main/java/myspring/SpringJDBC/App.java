package myspring.SpringJDBC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import myspring.SpringJDBC.config.DataConfig;
import myspring.SpringJDBC.service.UserService;

/**
 * Hello world!
 *
 */
public class App{
	public static void main(String[] args){
	AnnotationConfigApplicationContext cont=new AnnotationConfigApplicationContext(DataConfig.class); 
	UserService uservice=cont.getBean(UserService.class); 
	//uservice.insert();
	//uservice.update();
	//uservice.delete();
//	uservice.retreiveData();
	uservice.retreivebyId();
	}
}
