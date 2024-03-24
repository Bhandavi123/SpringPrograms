package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	private HomeLoanService homeLoanService;
	@Autowired
	private RealStateService realStateService;
	
	/*@Autowired
	public Person(HomeLoanService homeLoanService, RealStateService realStateService) {
		super();
		this.homeLoanService = homeLoanService;
		this.realStateService = realStateService;
		
	}*/
	public void details()
	{
		homeLoanService.LoanInfo();
		realStateService.realStateInfo();
	}

	
}
