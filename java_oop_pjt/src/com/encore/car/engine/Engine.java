package com.encore.car.engine;

public class Engine {
	
	private String engineType ; 
	
	// 생성자 또는 메서드는 매개변수의 타입과 개수를 달리해서 재 정의 할 수 있다.
	// 생성자 오버로딩, 메서드 오버로딩
	// 생성자는 매개변로 받은 값을 전역(멤버)변수에 할당하는 역할을 한다.
	public Engine() {
	}
	public Engine(String engineType) {
		this.engineType = engineType ; 
	}
	
	
	public String showInfo() {
		return "엔진의 타입은 "+engineType+" 입니다." ;
	}
}









