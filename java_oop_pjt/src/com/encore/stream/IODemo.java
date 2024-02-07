package com.encore.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo {
	
	public IODemo() {
	}

	public String inputStr() throws IOException { // 간접적인 예외 처리 중 하나
		// System.in.read(); // in이 인풋스트림이다 그래서 read를 불러올 수 있다. but 아스키 코드로 들어옴.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input Message : ");
		
		String data = reader.readLine();
		return data;
	}
	
	public int inputInt() { 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input Message : ");
		
		int data = 0;
	    try {
	    	data = Integer.parseInt(reader.readLine());
	    
	    } catch (NumberFormatException e) {
	    	e.printStackTrace();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	    
		return data;
		
	}
	
	public void first(int flag) throws EncoreException {
		System.out.println(">>> first start ");
		try {
			second(flag);
		} finally {
			System.out.println(">>> first end ");
		}
	}
	
	public void second(int flag) throws EncoreException {
		System.out.println(">>> second start ");
		try {
			third(flag);
		} finally {
			System.out.println(">>> second end ");
		}
	}
	
	public void third(int flag) throws EncoreException {
		System.out.println(">>> third start ");
		try {
			if(flag == 0) {
				throw new EncoreException("사용자 정의 예외 발생"); // 객체 생성
			}
		} finally {
			System.out.println(">>> third end ");
		}
	}
	
	
	
	
	
	
}
