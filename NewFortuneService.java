package com.luv2code.springdemo;

public class NewFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hockey is good for your luck";
	}

}
