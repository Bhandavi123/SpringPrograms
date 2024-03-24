package com.sathya.springex;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class JavaConfig {
	
	@Bean
	public Greetingimpl greet()
	{
		Greetingimpl greetingimpl=new Greetingimpl();
		return greetingimpl;
	}

}
