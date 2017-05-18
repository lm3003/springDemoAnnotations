package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneServiceReadsFile")
	private FortuneService theFortuneService;
	
	//Create a constructor for injection
//	@Autowired
//	public TennisCoach(FortuneService fortuneService){
//		theFortuneService=fortuneService;
//	}
	
	//default Constructor
	public TennisCoach(){
		System.out.println("Hey! Inside default constructor");
	}
	
	//define my init method
	
	public void doMyStartUpStuff(){
		System.out.println("This is my start up method");
	}
	
	//define my cleanup method
	@PreDestroy
	public void doMyCleanUpStuff(){
		System.out.println("Clean everything up buddy");
	}
	
	//Create a setter method for injection
//	@Autowired
//	public void setFortuneServie(FortuneService fortuneService){
//		theFortuneService=fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Practise your forehand daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getFortune();
	}

}
