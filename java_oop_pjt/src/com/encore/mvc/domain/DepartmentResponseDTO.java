package com.encore.mvc.domain;

// 데이터를 꺼내오는 DTO
// 디비로부터 데이터를 담는 그릇
// 자바에서는 char, varchar 모두 String

// DTO(instance) == Table(record)
public class DepartmentResponseDTO {

	private String dept_id; // DTO에 저장된 타입이 컬럼의 타입이라고 보면 된다.
	private String dept_name;
	private String loc_id;
	
	public DepartmentResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentResponseDTO(String dept_id, String dept_name, String loc_id) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.loc_id = loc_id;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getLoc_id() {
		return loc_id;
	}

	public void setLoc_id(String loc_id) {
		this.loc_id = loc_id;
	}

	@Override
	public String toString() {
		return "DepartmentResponseDTO [dept_id=" + dept_id + ", dept_name=" + dept_name + ", loc_id=" + loc_id + "]";
	}
	
	
}
