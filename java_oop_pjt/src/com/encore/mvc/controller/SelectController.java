package com.encore.mvc.controller;

import java.util.List;

import com.encore.mvc.domain.PostResponseDTO;
import com.encore.mvc.model.service.EncoreServiceImpl;

public class SelectController {
	
	private EncoreServiceImpl service;
	
	public SelectController() {
		service = new EncoreServiceImpl();
	}
	
//	public List<PostResponseDTO> execute() {
//		System.out.println(">>> SelectController selectRow <<<");
//		List<PostResponseDTO> resultList = service.selectService();
//		return resultList;
//	}

	// 강사님
	public List<PostResponseDTO> execute() {
		System.out.println(">>> SelectController execute <<< "); 
		// 의존관계형성 후 메서드 호출 / 반환 
		return service.selectService() ;   
	}
	
}
