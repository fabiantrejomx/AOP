package com.tech.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDAO {
		

	
	@Before("execution(* com.tech.aop.dao.UserDAO.updateNickname (..))")
	public void adviceB(final JoinPoint jp) {
		final MethodSignature method = (MethodSignature) jp.getSignature();
		System.out.println("Advice B - Nombre del método: " + method.getMethod().getName());
	}

}
