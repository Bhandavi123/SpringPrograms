package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService {

	@Override
	public void courseInfo() {
		System.out.println("Java full stack course");
		System.out.println("Corejava adv java spring boot ");
		
	}

}
