package com.xml.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
context = new ClassPathXmlApplicationContext("applicationcontext.xml");
Employee e = (Employee) context.getBean("manager");
e.doWork();
Employee e1 = (Employee) context.getBean("accountant");
e1.doWork();
	}

}
