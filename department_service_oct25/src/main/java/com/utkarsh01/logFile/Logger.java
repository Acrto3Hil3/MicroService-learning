package com.utkarsh01.logFile;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect @Component
@Slf4j
public class Logger {
	
	@Before(value = "execution(* com.utkarsh01..*(..))")
	public void beforeLoggig(JoinPoint jp) {
		log.info("Enter into : {}",jp.toShortString());
		
	}
}
