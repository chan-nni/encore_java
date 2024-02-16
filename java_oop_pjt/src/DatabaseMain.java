import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.encore.mvc.domain.DepartmentResponseDTO;

public class DatabaseMain {

	public static void main(String[] args) {
		// 데이터베이스에 접속하기 위해서는 
		// url, driver, id, pwd
		
		String URL = "jdbc:mariadb://localhost:3306/encore"; // 상수는 풀네임으로 구성되어야 함.
		String DRIVER = "org.mariadb.jdbc.Driver"; //  드라이버 안에 있는 패키지 중에 Driver 클래스가 있음.
		String ID = "root";
		String PASSWORD = "123456789";
		/* JDBC
		 * try {
		 * =============================== ORM(Mybatis, JPA)
		 * 1. 벤더사에서 제공하는 드라이버 로딩
		 * 2. 연결(url, id, password)
		 * 3. 실행구문을 담을 수 있는 그릇이 필요(Statement, PreparedStatement)
		 * 4. 실행(execute) - executeQuery(select - 결과집합을 넘겨줌), executeUpdate(insert, update, delete)
		 * 5. 실행결과를 반환 받는다.
		 * ===============================
		 * 6. 결과를 객체화 시키고 다건일 경우 자료구조를 이용해서 담는 것
		 * 7. 외부리소스(디비연결)를 닫는 것
		 * } catch() {
		 * 
		 * } finally {
		 * 
		 * }
		*/
		Connection conn = null;
		PreparedStatement pstmt = null; // sql문을 담는 그릇, 이걸 커넥션을 통해서 가져온다.
		ResultSet rset = null; 
		
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 로딩 완료!!");
			
			conn = DriverManager.getConnection(URL, ID, PASSWORD);
			System.out.println("디비연결 완료 >>> " + conn);
			
			/* single finder select
			String sql = "select dept_id, dept_name, loc_id from department where dept_id = ?"; // 동적바인딩한다.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "10");
			rset = pstmt.executeQuery(); // 가상의 테이블
			
			DepartmentResponseDTO response = null;
			
			while( rset.next() ) { // 가상의 테이블의 탑 포인트 커서를 한 칸 내린다. 즉 컬럼의 데이터를 꺼낸다.
				response = new DepartmentResponseDTO();
				response.setDept_id(rset.getString(1)); // select 구문의 레이블 1번을 가져온다.
				response.setDept_name(rset.getString(2));
				response.setLoc_id(rset.getString(3));
			}
			System.out.println("Result >>>> " + response);
			*/
			
			String sql = "insert into department values(?,?,?)"; // 쿼리문 생성
			pstmt = conn.prepareStatement(sql); // 그릇 생성
			pstmt.setString(1, "70");
			pstmt.setString(2, "교육");
			pstmt.setString(3, "A3");
			
			int result = pstmt.executeUpdate(); // 정상실행 : 1, 비정상실행 : 0 반환
			System.out.println("DML Result >>>> " + result);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) { conn.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
