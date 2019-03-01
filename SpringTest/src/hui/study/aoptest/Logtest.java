package hui.study.aoptest;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logtest {

	 public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
	        System.out.println("start log:" + joinPoint.getSignature().getName());
	        Object object = joinPoint.proceed();
	        System.out.println("end log:" + joinPoint.getSignature().getName());
	        return object;
	    }
	 
	 
	 public void before(){
		 System.out.println("this is before");
		 
	 }
	 
	 public void after(){
		 System.out.println("this is after");
		 
	 }
}
