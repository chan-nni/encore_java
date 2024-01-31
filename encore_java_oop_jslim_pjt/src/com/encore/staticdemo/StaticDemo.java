package com.encore.staticdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor 
public class StaticDemo {
	
	// 전역(인스턴스, 클래스)
	// 인스턴스 소유
	private String name  ;
	// 클래스 소유
	public static String staticMsg ; 

	public static final String URL = "나는 상수 입니다." ; 
	
	
	public void nonStatic() {
		System.out.println("나는 인스턴스 소유의 메서드 입니다.");
		// 인스턴스 소유 메서드에서 static 변수 및 메서드 사용이 가능하다.
		staticMsg = "jslim" ; 
	}
	public static void staticMethod() {
		System.out.println("나는 클래스 소유의 메서드 입니다.");
		// name = "encore" ; -- error static 영역에서 인스턴스 소유의 변수를 사용할 수 없다. 
		
	}
	
}







