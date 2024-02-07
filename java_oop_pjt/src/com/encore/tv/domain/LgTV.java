package com.encore.tv.domain;

import com.encore.tv.util.TV;

public class LgTV implements TV {
	
	public LgTV() {
	}
	
	@Override
	public void turnOn() {
		System.out.println("LTV turnOn");
	}

}
