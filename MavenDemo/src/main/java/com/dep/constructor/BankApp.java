package com.dep.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConf.class);
Manager m = con.getBean(Manager.class);
m.callMeeting();
con.close();
	}

}