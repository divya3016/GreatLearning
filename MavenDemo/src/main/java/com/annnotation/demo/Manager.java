package com.annnotation.demo;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
System.out.println("manager class");
	}

}
