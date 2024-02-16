package com.encore.mvc.controller;

import java.util.Map;

import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.model.service.EncoreServiceImpl;

// Insert 이므로, View 로부터 데이터를 넘겨받는다. 
// Controller 는 Service 를 갖는다.
public class insertController {

	private EncoreServiceImpl service;
	
	public insertController() {
		service = new EncoreServiceImpl();
	}
	
	public int execute(PostRequestDTO params) {
		System.out.println(">>> insertController execute <<<");
		System.out.println(">>> params : " + params);
		
		// service 와 의존관계 형성 후 메서드 호출 / 반환
		int flag = service.insertService(params);
		return flag;
	}
	
	public int execute(Map<String, String> params) {
		System.out.println(">> Ctrl insertRow <<");
		System.out.println(">> params : " + params);
		int flag = service.insertService(params);
		return flag;
	}
}
