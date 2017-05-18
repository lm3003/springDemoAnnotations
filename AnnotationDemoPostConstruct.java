package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoPostConstruct {

	public static void main(String[] args) {
	
		//load the spring file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive the bean
		NewCoach theCoach=context.getBean("footballCoach",NewCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getFortune());

	}

}
