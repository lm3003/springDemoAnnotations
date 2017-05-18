package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class HockeyCoach implements Coach {
	
	private NewFortuneService fortuneService;

	public HockeyCoach(NewFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Play hockey 5 hours a day";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
