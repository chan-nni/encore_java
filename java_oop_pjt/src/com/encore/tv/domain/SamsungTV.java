package com.encore.tv.domain;

import com.encore.tv.util.TV;

public class SamsungTV implements TV {
	
	public SamsungTV() {
	}
	
//	public void powerOn() { // 인스턴스 소유, 외부에서 객체 생성해서 접근하기
//		System.out.println("STV powerOn");
//	}

	@Override
	public void turnOn() {
		System.out.println("STV powerOn");
		
	}

}
