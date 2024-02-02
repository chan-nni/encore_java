package com.encore.hms.domain;

import com.encore.hms.domain.sup.Person;

public class StudentDTO extends Person{
	
	// 인스턴스의 소유가 될 변수
	// 상속 관계에서 공통의 요소로 제거
//	private String 	name;
//	private int 	age;
//	private String 	address;
	///////
	// 자기 자신만의 고유 요소
	private String 	stuId;
	
	// 기본 생성자 클래스의 이름과 동일하고 반환타입 없음
	public StudentDTO() {
		super(); // 없어도 묵시적으로 있음.
	}
	
	// private로 만들면 접근 불가하기 때문에 생성자 오버로딩을 통해 접근
	// 상속 관계에서 부모의 메서드를 슈퍼키로 지정을 하면 접근 가능
	public StudentDTO(String name, int age, String address, String stuId) {
		// super() 사용해서 부모의 기본 생성자를 호출
		// 없어도 된다. 묵시적으로 기본으로 들어가 있다.
		// 객체 생성을 먼저 해야지 메서드 접근 가능하기 때문에 명시적으로 표시하려면 super 키워드는 가장 첫번 째 라인에 사용해야 한다.
		// 슈퍼클래스를 통해 요소에 접근 가능
		// 내꺼는 내꺼고 부모것도 내꺼기 때문에 this로도 접근 가능 근데 가독성 측면으로 super.setName(name); 사용
		// super(name, age, address); 스페셜 constructor로 이렇게도 호출 가능
		super(); 
		super.setName(name);
		super.setAge(age);
		super.setAddress(address);
		this.stuId = stuId;
	}

	/*
	 * // 값을 리턴 public String getName() { return name; }
	 * 
	 * // 값을 받아서 할당 // this.name : 전역변수 // name : 지역 변수 public void setName(String
	 * name) { this.name = name; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { // 메서드 내에 기능부 if(age <= 0) {
	 * System.out.println("나이는 마이너스가 없어요..."); } else { this.age = age; } }
	 * 
	 * public String getAddress() { return address; }
	 * 
	 * public void setAddress(String address) { this.address = address; }
	 */

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	// to String Generate 하면 메서드를 문자열로 변환시켜준다.
	// 인스턴스의 필드값을 to String으로 리턴하도록 재정의함.
	/*
	 * @Override public String toString() { return "StudentDTO [name=" + name +
	 * ", age=" + age + ", address=" + address + ", stuId=" + stuId + "]"; }
	 */

	public String studentInfo() {
		// return "name=" + super.getName() + ", age=" + super.getAge() + ", address=" + super.getAddress() + ", stuId=" + this.stuId;
		return super.personInfo() + ", stuId=" + this.getStuId();
		
	}
}
