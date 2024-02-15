package com.encore.grade.domain;

public class EmployeeDTO {
	private String name;
	private String employeeNo;
	private int age;
	
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDTO(String name, String employeeNo, int age) {
		super();
		this.name = name;
		this.employeeNo = employeeNo;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String empInfo() {
		return "name=" + name + ", employeeNo=" + employeeNo + ", age=" + age;
	}
	

}
