package com.sathya.springex;

public class Doctor {
	
	private int Id;
	private String  name;
	public Doctor(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public void  doctorInfo()
	{
		System.out.println("hey id"+Id+"name"+name);
		
	}
		}
	


