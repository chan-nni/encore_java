package com.encore.data.structor.tree;

// 서비스 로직
// 트리에 있는 노드들을 순회하는 작업
public class TreeServiceImpl {
	
	public TreeServiceImpl() {
	}
	
	public TreeNode makeTree(int data, TreeNode leftNode, TreeNode rightNode) {
		// case 01.
		// TreeNode node = new TreeNode(data, leftNode, righNode);
		
		// case 02.
		TreeNode node = new TreeNode(data);
		node.setLeftNode(leftNode);
		node.setRightNode(rightNode);
		
		return node;
	}
	
	// 전위순회( 뿌리 -> 왼쪽자식 -> 오른쪽자식 )
	// 0 1 3 7 8 4 9 10 2 5 11 6
	public void preOrder(TreeNode node) {
		if(node != null) {
			System.out.print(node.getData() + "\t");
			preOrder(node.getLeftNode()); // 재귀호출로 노드가 노드를 가지는 구조
			preOrder(node.getRightNode());
			// System.out.println(node.getLeftNode().getData());
			// System.out.println(node.getRightNode().getData());
		}
	}
	
	// 중위순회( 왼쪽자식 -> 뿌리 -> 오른쪽자식 )
	// 7 3 8 1 9 4 10 0 11 5 2 6
	public void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.getLeftNode()); // 재귀 호출로 노드가 null이 아니면 계속 왼쪽 자식 노드의 하위 트리를 모두 방문한다.
			System.out.print(node.getData() + "\t"); // 왼쪽 자식 노드의 순회가 끝나면 현재 노드 출력
			inOrder(node.getRightNode()); // 재귀 호출은 호출 스택을 사용하여 작업을 저장한다. 재귀 호출을 하면 현재 실행중일 함수의 상태가 호출 스택에 저장된다. 
			// 이전 호출의 상태를 저장하면서 깊게 들어가는 원리
			// 재귀 호출로 그 다음 노드인 오른쪽 자식 노드 방문 오른쪽 자식 노드 데이터에도 동일한 프로세스 적용
		}
	}
	
	// 후위순회( 왼쪽자식 -> 오른쪽자식 -> 뿌리 )
	// 7 8 3 9 10 4 1 11 5 6 2 0
	public void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.getLeftNode());
			postOrder(node.getRightNode());
			System.out.print(node.getData() + "\t");
		}
	}
	
}
