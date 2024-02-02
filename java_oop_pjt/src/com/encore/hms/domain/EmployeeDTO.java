package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

public class EmployeeDTO extends Person{
	
//	private String 	name;
//	private int		age;
//	private	String 	address;
	private	String 	dept;
	
	public EmployeeDTO(String name, int age, String address, String dept) {
		super();
		super.setName(name);
		super.setAge(age);
		super.setAddress(address);
		this.dept = dept;
	}

	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * public String getAddress() { return address; }
	 * 
	 * public void setAddress(String address) { this.address = address; }
	 */

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String employeeInfo() {
		return "name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", dept=" + this.dept;
	}
	
}
