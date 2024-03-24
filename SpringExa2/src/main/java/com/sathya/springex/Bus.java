package com.sathya.springex;

public class Bus implements Vehicle {
	private String BusType;
	private int maxspeed;
	public String getBusType() {
		return BusType;
	}
	public void setBusType(String busType) {
		BusType = busType;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	@Override
	public void move() {
		System.out.println("Your selected bus vehicle");
		System.out.println("Max speed...."+maxspeed);
		System.out.println("BusType..."+BusType);
		
	}
	

}
