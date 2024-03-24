package com.sathya.springboot;

public class Test {

	public static void main(String[] args)
	{
		//Constructor injecting the values
				Employee employee=new Employee(100,"Bhandavi",50000.79);
				System.out.println(employee);
				//setters injecting the values
				 Employee employee2=new Employee();
				 employee2.setEmpId(1001);
				 employee2.setEmpName("Chinni");
				 employee2.setEmpsalary(55000.45);
				 System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpsalary());
				

	}

}
