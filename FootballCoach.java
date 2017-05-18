package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements NewCoach {

	@Override
	public String getFortune() {
		
		return "May you have a damn lucky shot today";
	}

}
