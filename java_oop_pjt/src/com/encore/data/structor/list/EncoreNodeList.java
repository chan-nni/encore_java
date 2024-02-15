package com.encore.data.structor.list;

public class EncoreNodeList {
	
	// LinkedList가 처음에 만들어지면 거기엔 데이터가 없다.
	private EncoreNode head ;
	
	public EncoreNodeList(int data) {
		// 2. 여기서 노드 객체가 만들어짐.
		this.head = new EncoreNode(data); // 하나의 헤더가 노드를 참조하는 구조
	}

	public void add(int data) {
		if(this.head == null) {
			// 연결 리스트의 헤더가 생성되지 않은 상태!!
			this.head = new EncoreNode(data); // 데이터를 담아서 노드를 만든다. 여기서 this는 없어도 된다.
		} else {
			// 연결되어지는 노드를 생성 (2번째 노드가 만들어지면, 데이터는 없고 주소값만 있는 상태)
			EncoreNode node = this.head;
			while(node.getNode() != null) { // node가 null이 아닐 때만 즉, 처음에만 최초 객체 생성시.
				node = node.getNode();
			}
			node.setNode( new EncoreNode(data) );
		}
	}
	
	public void desc() {
		EncoreNode node = this.head;
		while(node != null) {
			System.out.println("debug >>>> " + node.getData());
			node = node.getNode();
		}
	}
	
	public boolean remove(int data) {
		// System.out.println(this.head.getData());
	
		// 헤더를 삭제
		// 데이터가 하나이고 삭제하고자하는 데이터가 헤더일 때 삭제
		if (this.head.getData() == data) { // 리스트의 헤드 노드의 데이터가 주어진 데이터와 일치하는지 확인
			EncoreNode temp = this.head;  // 현재 헤드 노드를 임시 변수 temp에 저장
			this.head = this.head.getNode(); // 헤드 노드를 현재 헤드 노드의 다음 노드로 변경. 즉, 리스트에서 헤드 노드를 제거하는 것
			temp = null; // 이전 헤드 노드를 가리키던 temp 변수를 null로 설정하여 메모리를 해제
			return true; // 로직을 수행한다면 return true
		} else {
			// 삭제해야할 데이터가 head가 아니고 중간이나 마지막 노드라면? 
			EncoreNode node = this.head;
			while(node.getNode() != null) {
				if(node.getNode().getData() == data) {
					
					EncoreNode temp = node.getNode(); // 현재 노드를 temp라는 변수에 담는다.
					node.setNode(node.getNode().getNode()); // 현재노드의 다음 노드를 가져온다.
					temp = null; // 현재노드를 삭제하고 다음 노드가 현재노드를 받게 한다.
					return true; // 로직을 수행한다면 return true
					
				} else { // 원하는 데이터가 아닐 경우 다음 노드를 가짐, 그 다음 노드의 데이터가 일치할 경우 삭제
					node = node.getNode();
				
				}
			}
			
			// 내가한거
			/*
			EncoreNode current = this.head;
	        EncoreNode previous = null;

	        // 주어진 데이터와 일치하는 노드를 찾음
	        while (current != null && current.getData() != data) { 
	        	// 현재 노드의 데이터가 주어진 데이터와 다를 경우에만 루프를 계속
	        	// 즉, 현재 노드의 데이터와 주어진 데이터가 일치할 때까지 루프를 실행
	            previous = current; 
	            // 현재 노드를 이전 노드로 설정
	            // 이전 노드는 현재 노드의 이전에 위치하는 노드를 가리킨다.
	            // 초기에는 이전 노드를 null로 설정하고 시작하며, 루프를 한 번 돌 때마다 이전 노드는 현재 노드가 된다.
	            current = current.getNode();
	        }

	        // 만약 노드를 찾았다면
	        if (current != null) { // 현재 노드가 null이 아닌 경우를 체크한다. 즉, 주어진 데이터와 일치하는 노드를 찾았을 때 이 조건문이 실행
	            
	        	// 이전 노드의 다음 노드를 현재 노드의 다음 노드로 설정하여 연결을 끊음
	            previous.setNode(current.getNode()); // setNode() 메서드는 이전 노드의 다음 노드를 설정하는 메서드이며, 현재 노드를 건너뛰고 다음 노드와 이전 노드를 연결하여 리스트의 연결 구조를 유지
	            current = null; // 찾은 노드를 삭제
	            // 이 코드는 현재 노드를 메모리에서 삭제하는 것이 아니라, 현재 노드 변수를 null로 설정
	            // 현재 노드 변수를 null로 설정하여 해당 노드를 가리키지 않게 만든다.
	        }*/
	        
		}
		return false; // 로직을 수행하지 못한다면 return false
		
	}

}
