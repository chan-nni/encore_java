package com.encore.mvc.controller;

import java.util.List;

import com.encore.mvc.domain.PostResponseDTO;
import com.encore.mvc.model.service.EncoreServiceImpl;

public class SelectController {
	
	private EncoreServiceImpl service;
	
	public SelectController() {
		service = new EncoreServiceImpl();
	}
	
	public List<PostResponseDTO> execute() {
		System.out.println(">>> Ctrl selectRow <<<");
		List<PostResponseDTO> resultList = service.selectService();
		return resultList;
	}

}
