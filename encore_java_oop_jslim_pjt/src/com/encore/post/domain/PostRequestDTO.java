package com.encore.post.domain;

public class PostRequestDTO {

	private String id;
	private String title;
	private String content;
	private int cnt;
	private boolean isFlag;

	
	
	public PostRequestDTO() {
	}
	
	public PostRequestDTO(String id) {
		this.id = id;
	}
	
	public PostRequestDTO(String id, String title, String content, int cnt, boolean isFlag) {
		this.id = id;
		this.title = title;
		this.content = content;
		//
		this.cnt = cnt;
		this.isFlag = isFlag;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public boolean isFlag() {
		return isFlag;
	}

	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}

}
