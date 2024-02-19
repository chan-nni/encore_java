package com.encore.mvc.model.service;

import java.util.List;
import java.util.Map;

import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;
import com.encore.mvc.model.sql.EncoreDAO;

// Service는 DAO 갖는다.
public class EncoreServiceImpl {
	
	private EncoreDAO dao;

	public EncoreServiceImpl() {
		dao = new EncoreDAO();
	}
	
	// DAO insertRow() 메서드를 호출해서 결과 반환
	public int insertService(PostRequestDTO params) {
		System.out.println(">>> Service insertRow <<<");
		System.out.println(">>> params : " + params);
		int flag = dao.insertRow(params);
		return flag;
		
	}
	
	public int insertService(Map<String, String> params) {
		System.out.println(">>> Service insertService <<<");
		System.out.println(">>> params : " + params);
		int flag = dao.insertRow(params);
		return flag;
		
	}
	
//	public List<PostResponseDTO> selectService() {
//		System.out.println(">>> Service selectService <<<");
//		List<PostResponseDTO> resultList = dao.selectRow();
//		return resultList;
//		
//	}
	
	// 강사님
	public List<PostResponseDTO> selectService() {
		System.out.println(">>> Dao insertService <<< "); 
		return dao.selectRow() ; 
	}
	
}
