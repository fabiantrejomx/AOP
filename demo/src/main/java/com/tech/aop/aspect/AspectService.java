package com.tech.aop.aspect;

import java.lang.reflect.Parameter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectService {
	

	@Before("execution(* com.tech.aop.service.*.* (..))")
	public void advice(final JoinPoint jp) {
		
		final MethodSignature method = (MethodSignature) jp.getSignature();
		
		System.out.println("Advice - Nombre del método: " + method.getMethod().getName());
		
		System.out.println("Advice - Número de parametros: " + method.getMethod().getParameterCount());
		
		final Parameter[] params = method.getMethod().getParameters();
		
		int index = 0;
		for(final Parameter param : params) {
			System.out.println("Advice - Valor del parametro: ---> " + jp.getArgs()[index]);		
			index++;
		}
	}
	
	


}
