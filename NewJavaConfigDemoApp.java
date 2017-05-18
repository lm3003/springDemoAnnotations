package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewJavaConfigDemoApp {

	public static void main(String[] args) {
		//load the spring config
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(NewSportConfig.class);
		
		//retrieve the bean
		Coach theCoach=context.getBean("hockeyCoach",Coach.class);
		
		
		// call the methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		
		context.close();

	}

}
