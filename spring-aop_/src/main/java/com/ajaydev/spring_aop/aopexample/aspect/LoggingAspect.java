package com.ajaydev.spring_aop.aopexample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Before("execution(* com.ajaydev.spring_aop.aopexample.data.*.*(..))")
	public void logMethodCall(JoinPoint joinPoint) {
		logger.info("Before aspect Method is called-{}", joinPoint);
		
	}
	
	@After("execution(* com.ajaydev.spring_aop.aopexample.*.*.*(..))")
	public void logMethodAfterCall(JoinPoint joinPoint) {
		logger.info("After aspect Method is called-{}", joinPoint);
		
	}
}
