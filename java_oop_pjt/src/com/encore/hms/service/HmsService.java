package com.encore.hms.service;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

/*
 * business logic 가지고 있는 클래스
 * 1. 배열을 관리
 * 2. 생성된 배열에 학생, 강사, 직원 객체를 담을 것
 * 3. 배열의 인덱스를 이용해서 찾기, 수정, 삭제 등의 기능을 수행할 것
*/
public class HmsService {
	
	private Person [] perAry ;
	private int idx ; // 배열의 인덱스를 관리하는 변수 선언
	
	public HmsService() {
		
	}
	
	public HmsService(int size) {
		perAry = new Person[size];
	}
	
	// 객체 생성 후 배열에 담는 로직
	// 타입의 다형성
	public String makePerson(int flag, String name, int age, String address, String comm) {
		String msg = null;
		Person obj = null;
		switch(flag) {
			case 1 :
				obj = new StudentDTO(name, age, address, comm);
				return "학생 객체를 생성하고 배열에 담았습니다.";
			case 2 : 
				obj = new TeacherDTO(name, age, address, comm);
				return "강사 객체를 생성하고 배열에 담았습니다.";
			case 3 :
				obj = new EmployeeDTO(name, age, address, comm);
				return "직원 객체를 생성하고 배열에 담았습니다.";
		}
		return msg;
	}
	
}
