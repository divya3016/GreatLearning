package com.maven.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
    HelloWorld obj =  (HelloWorld) context.getBean("hello");
    obj.printHello();
    ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-module.xml");
    Emp obj1 =  (Emp) context1.getBean("hello1");
    obj1.printInfo();
  }
}
