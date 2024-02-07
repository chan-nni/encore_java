package com.encore.tv.factory;

import com.encore.tv.domain.LgTV;
import com.encore.tv.domain.SamsungTV;
import com.encore.tv.util.TV;

/*
Singleton pattern : 인스턴스의 갯수를 하나로 유지하는 방법
1. 생성자의 접근지정자를 private
2. getInstance() 정의해서 자기자신의 생성된 객체를 반한하는 구현
*/
public class TvBeanFactory {
	private TV [] ary ; // 다형성
	private static TvBeanFactory instance;
	
	public TvBeanFactory() {
		ary = new TV [2];
		ary[0] = new SamsungTV();
		ary[1] = new LgTV();
	}
	
	public static TvBeanFactory getInstance() { // static를 붙이면 클래스의 소유가 됨.
		if(instance == null) {
			instance = new  TvBeanFactory();
		}
		return instance;
	}
	
	public TV getBean(String brandName) {
		return (brandName.equals("samsung")) ? ary[0] : ary[1];
	}
}
