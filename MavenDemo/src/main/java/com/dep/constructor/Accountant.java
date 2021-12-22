package com.dep.constructor;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements EmpInterface {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
System.out.println("inside accountant job profile");
	}

	@Override
	public void jobDetails() {
		// TODO Auto-generated method stub
System.out.println("accounant handle account");
	}

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("inside accountant constructor");
	}

}
