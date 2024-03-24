package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	
	public Doctor doctor()
	{
		Doctor doctor=new Doctor(1, "Mr.Shanmukh");
		return doctor;
		
	}
	@Bean
	public Pharmacy pharmacy()
	{
		Pharmacy pharmacy=new Pharmacy("Bhandavi","Siddipet");
		return pharmacy;
	}
	
	@Bean
	public Patient patient()
	{
		Patient patient=new Patient("Raghuu",24,doctor(), pharmacy());
		return patient;
	}
	

	
}
