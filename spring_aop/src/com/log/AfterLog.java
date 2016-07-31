package com.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {
	/**
	//在目标方法执行之后才会执行的
	 * returnValue--返回值
	 * method被调用的方法对象
	 * args 被调用的方法的参数
	 * target 被调用的方法对象
	 * 
	 * @author Administrator
	 *
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg2,
			Object target) throws Throwable {
		System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被成功执行，返回结果是"+returnValue);
		
	}

}
