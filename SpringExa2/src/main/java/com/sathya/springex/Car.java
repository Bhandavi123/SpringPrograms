package com.sathya.springex;

public class Car implements Vehicle {
	 
	private String fuelType;
	private int maxspeed;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
			System.out.println("Your selected car vehicle");
			System.out.println("Max speed...."+maxspeed);
			System.out.println("Fuel type..."+fuelType);
			
	}
	
	}
		
		
	
	


