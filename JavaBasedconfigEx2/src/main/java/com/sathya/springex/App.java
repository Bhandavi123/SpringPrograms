package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
      //start the container
    	ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
    	
    	//get the object from container call your methods
    	Person person1=context.getBean("person1",Person.class);
    	person1.personInfo();
    	System.out.println("***********");
    	
    	Person person2=context.getBean("person2",Person.class);
    	person2.personInfo();
    	System.out.println("***********");
    }
}
