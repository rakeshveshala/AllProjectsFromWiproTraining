package mypackage.SpringAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyServiceAspect {
	@Before("execution(* mypackage.SpringAOP.MyService.insert())")
	public void beforeAdvice(JoinPoint point){
		System.out.println("This method will be called before insert");
	}
	@After("execution(* mypackage.SpringAOP.MyService.m*())")
	public void afterAdvice (JoinPoint point)
	{
		System.out.println("after advice being called for "+point.getSignature().toShortString()); 
		System.out.println("this adivse will be after methods");
	}
//	@AfterReturning("execution(* mypackage.SpringAOP.MyService.m*())")
//	public void afterReturningAdvice(JoinPoint point)
//	{
//		System.out.println("after advice being called for "+point.getSignature().toShortString()); 
//		System.out.println("this advise will be after methods");
//	}
	@AfterThrowing(value="execution(* mypackage.SpringAOP.MyService.show())", throwing="ex")
	public void throwingAdvice(JoinPoint point, Exception ex)
	{
		System.out.println("This advice will come if my function is throwing exception"+ex);
	}
}
