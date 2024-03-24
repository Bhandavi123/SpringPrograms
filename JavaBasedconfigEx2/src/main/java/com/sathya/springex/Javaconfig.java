package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("Bhandavi");
		person.setEmail("bhandavi@123gmail.com");
		return person;
	}
	@Bean
	public Person person2()
	{
		Person person=new Person();
		person.setName("Komalatha");
		person.setEmail("Komalatha@123gmail.com");
		return person;

		
	
	}	
	

}
