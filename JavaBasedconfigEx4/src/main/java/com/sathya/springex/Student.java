package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Autowired
  private EmailService emailService;
	@Autowired
  private JavaCourseService javaCourseService;
  

public EmailService getEmailService() {
	return emailService;
}

/*@Autowired
public void setEmailService(EmailService emailService) {
	this.emailService = emailService;
}


public JavaCourseService getJavaCourseService() {
	return javaCourseService;
}

@Autowired
public void setJavaCourseService(JavaCourseService javaCourseService) {
	this.javaCourseService = javaCourseService;
}*/


public void deatils() {
	emailService.message();
	javaCourseService.courseInfo();
  
  
}
}
  

