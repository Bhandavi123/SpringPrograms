package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("your email is updated...");
		System.out.println("please check it once");
		System.out.println("bhandavi@123gmail.com");
	}

}
