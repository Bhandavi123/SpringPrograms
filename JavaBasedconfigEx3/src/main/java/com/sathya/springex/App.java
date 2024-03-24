package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the  ioc container
    	ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
    	System.out.println("***********");
    	//get  the bean
    	
    	Student student=context.getBean("student",Student.class);
    	student.deatils();
    }
}

