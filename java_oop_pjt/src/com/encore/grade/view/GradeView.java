package com.encore.grade.view;

import com.encore.grade.domain.EmployeeDTO;
import com.encore.grade.domain.StudentDTO;

public class GradeView {
	
	private EmployeeDTO [] empAry;
	private int idx;
	///////////////////////////// 과목별 총점을 담을 수 있는 변수
	private int oracleSum = 0, javaSum = 0, servletSum = 0;
	
	public GradeView() {
		empAry = new EmployeeDTO [2]; // 다형성
	}
	
	public void init() {
		empAry[idx++] = new StudentDTO("kim", "10000", 22, 100, 100, 100);
		empAry[idx++] = new StudentDTO("kim", "10000", 23, 20, 20, 20);
	}
	
	// 과목 별 점수 계산
	public void gradeSum() {
		for(int i = 0; i < empAry.length; i++) {
			EmployeeDTO obj = empAry[i];
			oracleSum += ((StudentDTO)obj).getOracle(); // obj의 타입을 캐스팅
			javaSum += ((StudentDTO)obj).getJava();
			servletSum += ((StudentDTO)obj).getServlet();
		}
	}
	
	public void display() {
		gradeSum();
		System.out.println("번호\t이름\t오라클\t자바\t서블릿\t총점\t평균");
		System.out.println("====================================================");
		for(int i = 0; i < empAry.length; i++) {
			EmployeeDTO obj = empAry[i];
			System.out.println( (idx+1) + "\t" + obj.getName() + "\t" + ((StudentDTO)obj).getOracle() + "\t" + ((StudentDTO)obj).getJava() + "\t" + ((StudentDTO)obj).getServlet() + "\t" + 
								( ((StudentDTO)obj).getOracle() + ((StudentDTO)obj).getJava() + ((StudentDTO)obj).getServlet() ) + "\t" +
								( ( (double)((StudentDTO)obj).getOracle() + ((StudentDTO)obj).getJava() + ((StudentDTO)obj).getServlet() ) )/3);
			
		}
		System.out.println("====================================================");
		System.out.println("총점(오라클, 자바, 서블릿) : " + oracleSum+ "\t" + javaSum + "\t" + servletSum);
	}
	

}
