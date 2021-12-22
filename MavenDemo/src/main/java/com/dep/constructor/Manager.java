package com.dep.constructor;

import org.springframework.stereotype.Component;

@Component
public class Manager implements EmpInterface {
Accountant acc;

	public Manager(Accountant acc) {
	super();
	System.out.println("manager constructor");
	this.acc = acc;
}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
System.out.println("inside manager job profile");
	}

	@Override
	public void jobDetails() {
		// TODO Auto-generated method stub
System.out.println("manager class");
	}
public void callMeeting() {
  acc.doWork();	
  acc.jobDetails();
}

}
