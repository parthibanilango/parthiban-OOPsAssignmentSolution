package com.greatlearning.driver;

import com.greatlearning.department.AdminDepartment;
import com.greatlearning.department.HRDepartment;
import com.greatlearning.department.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment adminDepartment = new AdminDepartment();
		HRDepartment hrDepartment = new HRDepartment();
		TechDepartment techDepartment = new TechDepartment();
		
		System.out.println(adminDepartment.displayGreetingAndInformation());
		System.out.println(System.lineSeparator());
		System.out.println(hrDepartment.displayGreetingAndInformation());
		System.out.println(System.lineSeparator());
		System.out.println(techDepartment.displayGreetingAndInformation());

	}

}
