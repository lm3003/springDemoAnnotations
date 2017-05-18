package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read the spring config file
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get tennis bean from spring container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		//get football bean from spring container
		//NewCoach alphaCoach=context.getBean("footballCoach",NewCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		//Call football bean to get fortune
		//System.out.println("Football fortune today: "+alphaCoach.getFortune());
		System.out.println(theCoach.getDailyFortune());
		
		//call new methods for swim coach ...has prop injection
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		
		//close context
		context.close();

	}

}
