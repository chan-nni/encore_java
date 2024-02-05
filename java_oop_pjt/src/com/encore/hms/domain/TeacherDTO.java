package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

public class TeacherDTO extends Person{
	// 정보 은닉화
//	private String	name;
//	private int		age;
//	private String 	address;
	///////
	private String	subject;

	public TeacherDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TeacherDTO(String name, int age, String address, String subject) {
		super();
		super.setName(name);
		super.setAge(age);
		super.setAddress(address);
		this.subject = subject;
	}
	
	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public int getAge() { return age; } public void
	 * setAge(int age) { this.age = age; } public String getAddress() { return
	 * address; } public void setAddress(String address) { this.address = address; }
	 */
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String teacherInfo() {
		// return "name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", subject=" + this.subject;
		return super.personInfo() + ", subject=" + this.subject;
	}
	
	@Override
	public String personInfo() {
		return super.personInfo() + ", subject=" + this.subject;
	}
	
}
