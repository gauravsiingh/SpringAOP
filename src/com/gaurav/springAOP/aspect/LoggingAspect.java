package com.gaurav.springAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public * get*())")
	public void LoggingAdvice() {
		System.out.println("Advice ran, the get() method called");

	}
	
	@Before("execution(public * get*())")
	public void secondAdvice() {
		System.out.println("Second Advice Executed");
	}

}
