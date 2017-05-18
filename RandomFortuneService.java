package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of fortunes
	private String [] data={
			"Beware the ides of march",
			"Hide today to save yourself",
			"Hit your goal today"};
	
	private Random myRandom=new Random();
	@Override
	public String getFortune() {
		//pick a random fortune from array of strings
		int index=myRandom.nextInt(data.length);
		return data[index];
	}

}
