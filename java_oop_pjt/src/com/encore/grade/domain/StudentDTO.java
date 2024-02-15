package com.encore.grade.domain;

public class StudentDTO extends EmployeeDTO {
	private int oracle;
	private int java;
	private int servlet;
	
	public StudentDTO() {
		super();
	}

	public StudentDTO(String name, String employeeNo, int age, int oracle, int java, int servle) {
		super(name, employeeNo, age);
		this.oracle = oracle;
		this.java = java;
		this.servlet = servle;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getServlet() {
		return servlet;
	}

	public void setServlet(int servlet) {
		this.servlet = servlet;
	}
	
	private int getTotal() {
		int total = oracle + java + servlet;
		return total;
		
	}
	
	private double getAverage() {
		int total = oracle + java + servlet;
		double avg = total/3;
		return avg;
		
	}

	@Override
	public String empInfo() {
		return super.empInfo() + "oracle=" + oracle + ", java=" + java + ", servlet=" + servlet;
	}
	
}
