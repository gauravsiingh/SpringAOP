package com.gaurav.springAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters()")
	public void LoggingAdvice() {
		System.out.println("Advice ran, the get() method called");

	}
	
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice Executed");
	}
	
	@Pointcut("execution(public * get*())")
	public void allGetters() {
	}

}
