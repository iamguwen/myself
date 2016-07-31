package com.log;


import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Log implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println(arg2.getClass().getName()+"µÄ"+arg0.getName()+"·½·¨");
		
	}
	

}
