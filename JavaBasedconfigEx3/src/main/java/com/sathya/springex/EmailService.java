package com.sathya.springex;

public class EmailService implements MessageService{

	@Override
	public void message() {
		System.out.println("your email is updated...");
		System.out.println("please check it once");
		System.out.println("bhandavi@123gmail.com");
		
	}

}
