package com.encore.data.structor.stack;

import java.util.EmptyStackException;

public class EncoreStack {
	
	private int [] stackAry ;
	private int top;
	
	public EncoreStack() {
		stackAry = new int[6];
		top = -1;
	}
	
	public void push(int data) {
		stackAry[++top] = data; // top++은 후위 연산자여서 실제 데이터는 -1부터 들어가서 에러, 전위연산자인 ++top을 써야한다.
	}

	public int pop() {
		if(top == -1) {
			throw new EmptyStackException();
		}
		return stackAry[top--];
	}
	
	public boolean isEmpty() {
		if ( top == -1 ) {
			return true;
		} else {
			return false;
		}
	}
	
	// 마지막 인덱값을 리턴
	public int peek() {
		if(top == 1) {
			throw new EmptyStackException();
		}
		return stackAry[top];
		
	}
	
	// 스택에 들어 있는 요소를 출력
	public void prtStack() {
		for(int idx = top; idx >= 0; --idx) { 		
		// 가장 마지막 인덱스를 꺼낸다면 idx를 top으로 준다. 
		// 마지막 인덱스부터 시작하기 때문에 전위 연산인 --idx를 사용한다.
			System.out.println( stackAry[idx] );
		}
	}
}
