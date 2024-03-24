package com.sathya.springex;

public class Person {
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void personInfo()
	{
		System.out.println("Hey"+name+"Bhandavi");
		System.out.println("Hey"+email+"bhandavi@123gmail.com");
	}
	public void personInfo1()
	{
		System.out.println("Hey"+name+"Bhandavi");
		System.out.println("Hey"+email+"bhandavi@123gmail.com");

}
}
