package com.encore.data.structor.tree;

// 이진 트리 만들고 순회방법을 확인해 볼 예정
// 최대 두 개의 노드를 가질 수 있음.
public class TreeNode {
	
	private int data;
	private TreeNode leftNode; 
	private TreeNode rightNode;
	
	public TreeNode() {
	}
	
	// 생성자는 멤버 변수에 대한 초기화
	public TreeNode(int data) {
		this.data = data;
	}
	
	public TreeNode(int data, TreeNode leftNode, TreeNode rightNode) { // 생성자 오버로딩
		this.data = data;
		this.leftNode = leftNode; // 멤버 변수 초기화
		this.rightNode = rightNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	
}
