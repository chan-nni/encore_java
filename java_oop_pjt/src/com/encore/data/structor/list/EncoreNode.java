package com.encore.data.structor.list;

public class EncoreNode { // 데이터를 만들어서 객체를 관리
	
	private int data;
	private EncoreNode node; // 노드는 데이터 말고 노드 안에 또 다른 노드를 가질 수 있다.
	
	public EncoreNode(int data) { // 노드에 데이터 담아서 생성, 데이터는 있지만 노드는 null이다.
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setNode(EncoreNode node) { // 세팅 설정
		this.node = node;
	}

	public EncoreNode getNode() {
		return this.node;
	}
}
