package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewSportConfig {
	
	@Bean
	public NewFortuneService newFortuneService(){
		return new NewFortuneService();
	}
	
	@Bean
	public Coach hockeyCoach(){
		return new HockeyCoach(newFortuneService());
	}

}
