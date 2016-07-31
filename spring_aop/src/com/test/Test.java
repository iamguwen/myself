package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Hello;
import com.service.UserService;

public class Test {
	public static void  main(String args[]) {
		//½âÎöbean
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService)context.getBean("userService");
		userService.add();
	}
}
