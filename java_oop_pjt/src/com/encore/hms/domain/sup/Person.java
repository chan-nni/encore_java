package com.encore.hms.domain.sup;

public class Person {
	
	// 자식들에게 물려줄 공통의 요소
	// 접근 제어자가 private 이므로 자식이지만 접근을 허용하지 않는다. 
	// 다만 protected 열어주면 자식에 접근을 허용할 수 있다.
	// ex) protected String name;
	private String 	name;
	private int 	age;
	private String 	address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// 만약, 자식 클래스에서 메서드를 오버라이딩을 못하게 하고 싶다면?
	// final
	public String personInfo() {
		return "name=" + name + ", age=" + age + ", address=" + address;
	}
}
