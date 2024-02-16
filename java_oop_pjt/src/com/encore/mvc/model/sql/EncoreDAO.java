package com.encore.mvc.model.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;

// 비지니스 로직X, 디비 연동 작업만 다룬다.
// Bussiness 계층(Service) - Persistance 계층(DAO) 
// Dao - Database 관계를 전담하는 객체
public class EncoreDAO {
	
	// url, driver, id, pwd
	public static final String URL 		= "jdbc:mariadb://localhost:3306/encore"; // 상수는 풀네임으로 구성되어야 함.
	public static final String DRIVER 	= "org.mariadb.jdbc.Driver"; //  드라이버 안에 있는 패키지 중에 Driver 클래스가 있음.
	public static final String ID 		= "root";
	public static final String PASSWORD = "123456789";

	public EncoreDAO() {
		
		// 드라이버는 한번만 생성되야 한다.
		try {
			Class.forName(DRIVER); // 딱 한번만 넣어주면 된다. 로딩을 한 번만 한다. (생성자에 넣기)
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int insertRow(PostRequestDTO params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		
		Connection 			conn 	= null;
		PreparedStatement 	pstmt 	= null; 
		ResultSet 			rset 	= null; 
		
		int flag = 0;
		String query = "insert into post_tbl(title, content, writer) values(?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, params.getTitle());
			pstmt.setString(2, params.getContent());
			pstmt.setString(3, params.getWriter());
			flag = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) { conn.close(); }
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return flag;
	}
	
	public int insertRow(Map<String, String> params) {
		System.out.println(">>> Dao insertRow <<<");
		System.out.println(">>> params : " + params);
		Connection conn = null;
		PreparedStatement pstmt = null;
		int flag = 0;
		String query = "insert into post_tbl(title, content, writer) values(?,?,?)";
		
		try {
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, params.get("title"));
			pstmt.setString(2, params.get("content"));
			pstmt.setString(3, params.get("writer"));
			flag = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(conn != null) {conn.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		// int flag = executeUpdate();
		return 1;
	}
	// PostResponseDTO - idx, title, content, writer
	// return list.add(PostResponseDTO)
	public List<PostResponseDTO> selectRow(){
		System.out.println(">>> Dao selectRow <<<");
		
		List<PostResponseDTO> resultList = new ArrayList<>();
		
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
		
	    try {
	    	conn = DriverManager.getConnection(URL, ID, PASSWORD);
	    	String query = "select idx, title, content, writer from post_tbl";
	    	pstmt = conn.prepareStatement(query);
	    	// 쿼리 실행
	        rs = pstmt.executeQuery();
	        
	        // 결과 처리
	        while (rs.next()) {
	            PostResponseDTO post = new PostResponseDTO();
	            post.setTitle(rs.getString("title"));
	            post.setContent(rs.getString("content"));
	            post.setWriter(rs.getString("writer"));
	            resultList.add(post);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        // 리소스 해제
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return resultList;
	}
	
}











