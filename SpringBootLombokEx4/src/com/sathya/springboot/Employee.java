package com.sathya.springboot;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class Employee {
	private int empId;
	@NonNull String empName;
	private double empsalary;

}
