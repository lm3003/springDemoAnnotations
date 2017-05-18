package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read the spring config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get tennis bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		//get football bean from spring container
		//NewCoach alphaCoach=context.getBean("footballCoach",NewCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//Call football bean to get fortune
		//System.out.println("Football fortune today: "+alphaCoach.getFortune());
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();

	}

}
