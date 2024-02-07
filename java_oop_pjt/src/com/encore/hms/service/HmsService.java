package com.encore.hms.service;

import java.util.Scanner;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.util.HmsType;

/*
 * business logic 가지고 있는 클래스
 * 1. 배열을 관리
 * 2. 생성된 배열에 학생, 강사, 직원 객체를 담을 것
 * 3. 배열의 인덱스를 이용해서 찾기, 수정, 삭제 등의 기능을 수행할 것
*/
public class HmsService {
	public static Scanner scan = new Scanner(System.in) ;
	
	private Person [] perAry ;
	private int idx ; // 배열의 인덱스를 관리하는 변수 선언
	
	public HmsService() {
		
	}
	
	public HmsService(int size) {
		perAry = new Person[size];
	}
	
	// 객체 생성 후 배열에 담는 로직
	// 매개변수의 다형성
	public String makePerson(HmsType flag, String name, int age, String address, String comm) {
		String msg = null;
		Person obj = null;
		switch(flag) { 
			case STU :
				obj = new StudentDTO(name, age, address, comm);
				break;
			case TEA : 
				obj = new TeacherDTO(name, age, address, comm);
				break;
			case EMP :
				obj = new EmployeeDTO(name, age, address, comm);
				break;
		}
		setAry(obj); // 배열에 담는다.
		return (idx-1) + "번지에 데이터를 담았습니다.";
	}
	public void setAry(Person per) { // 객체 생성 시 0부터 담긴다. 1개 씩 담길 때마다 인덱스는 1씩 증가한다.
		perAry[idx++] = per;
	}
	
	public int getIdx() {
		return idx;
	}

	public Person[] getAry() {
		return perAry;
	}
	
	// 찾기
	public Person searchPerson(String name) {
		Person person = null;
		for(int idx = 0; idx < perAry.length; idx++) {
			
			person = perAry[idx];
			if(person != null) {
				if(person.getName().equals(name)) {
					return person;
				}
			}
		}
		return null;
	}
	
	// 수정
	// deep copy 방법
	// 1. 배열 객체가 가지고 있는 clone();
	// 2. Arrays.copyOf(ary, ary.length); -- 클래를 통해 메서드에 접근, 클래스 소유 static이다.
	public Person updatePerson(String name) {
		/* 
		1.
		Person[] copyAry = perAry.clone();
		   
		2.
		import java.util.Arrays;
		Person[] copyAry1 = Arrays.copyOf(perAry, perAry.length);
		
		System.out.println("original ary address : " + perAry);
		System.out.println("copy 	 ary address : " + copyAry);
		*/
		
		return searchPerson(name);
	    
	}
	
	// 삭제
	
	public boolean removePerson(String name) { 
		for(int i = 0; i < perAry.length; i++) {
			Person person = perAry[i];
			if (person != null) {
				if (person.getName().equals(name)) {
					for(int j = i; j < perAry.length-1; j++) {
						perAry[j] = perAry[j+i];
					}
					idx = idx - 1;
					perAry[idx] = null;
					return true;
				}
			}
		}
		  
		return false;
	}
	 
	
}
