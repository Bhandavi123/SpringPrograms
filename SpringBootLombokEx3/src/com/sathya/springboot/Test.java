package com.sathya.springboot;



public class Test {

	public static void main(String[] args) {
		Employee employee = Employee.builder()
				.empId(1001)
				.empName("bandavi")
				.empsalary(2000.34)
				.build();
		System.out.println(employee);
  
	}
}

	