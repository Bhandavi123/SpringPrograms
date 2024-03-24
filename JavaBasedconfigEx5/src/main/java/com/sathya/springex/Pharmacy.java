package com.sathya.springex;

public class Pharmacy {
	
	private String name;
	private String Location;
	public Pharmacy(String name, String location) {
		super();
		this.name = name;
		Location = location;
	}
	public void pharInfo()
	{
	   System.out.println("Name..."+name+"Location..."+Location);	
	}
	}
	


