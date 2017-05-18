package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String[] args){
	
	
	//load the spring file
	ClassPathXmlApplicationContext context=
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//retrieve the context
	Coach theCoach=context.getBean("tennisCoach",Coach.class);
	Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
	
	//check if they are same
	boolean result=(theCoach==alphaCoach);
	
	System.out.println("both beans pointing to Same location in memory?:" +result);
	}
}
