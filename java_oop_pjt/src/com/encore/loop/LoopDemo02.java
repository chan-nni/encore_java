package com.encore.loop;

import java.util.Scanner;
/*

초기값 ;
while(조건식) {
	statement ;
	[증감식 or 분기문]
}
증감식값이 없으면 무한루프
필요에 따라서 while(true) 무한 반복을 유도

초기값 ;
do{
	statement;
	[증감식 or 분기문]
} while( 조건식 ) ; 

while(true)       - 무한루프
do ~ while(false) - 한번 수행하고 끝마친다. 

*/
public class LoopDemo02 {
	
	// default constructor 
	public LoopDemo02() {
	}
	
	
	// 1 ~ 난수(100)까지의 합을 구해보고 싶다.
	public void sumRandom() {
		int nan = (int)(Math.random() * 100) + 1 ;   
		System.out.println("nan = "+ nan); 
		int sum = 0 ; 
		for(int idx = 1 ; idx <= nan ; idx++) {
			sum += idx ; 
		}
		System.out.println("sum = "+ sum); 
	}
	
	// 난수 두 개를 발생시켜서 최소값부터 최대값까지의 합을 구하고 싶다면?
	public void sumRandomTow() {
		int min = 0, max = 0, sum = 0 ;
		int first  = (int)(Math.random() * 100) + 1 ;   
		int second = (int)(Math.random() * 100) + 1 ;   
		
		if(first > second) {
			max = first ;
			min = second ; 
		} else {
			max = second ;
			min = first ;
		}
		
		for(int idx = min ; idx <= max ; idx++) {
			sum += idx ; 
		}
		System.out.println("sum = "+ sum); 
	}
	
	// A ~ Z 출력하는 구문을 작성한다면 
	public void charPrint(char start , char end) {
		for(char idx = start ; idx <= end ; idx++) {
			System.out.printf("%c \t" , idx); 
		}
	}
	
	// 1 ~ 100 사이의 홀수의 합을 출력한다면? 
	public void sumOdd() {
		int sum = 0 ; 
		for(int idx = 1 ; idx <= 100 ; idx++) {
			if(idx%2 != 0) {
				sum += idx ; 
			}
		}
		System.out.println("sum = " + sum );
	}
	
	// 1 ~ 난수(100)를 발생시켜서 짝수의 개수가 몇개인지 출력한다면?
	public void countEven() {
		int nan = (int)(Math.random() * 100) + 1 ;   
		int cnt = 0 ; 
		for(int idx = 1 ; idx <= nan ; idx++) {
			if(idx % 2 == 0) {
				cnt++ ; 
			}
		}
		System.out.printf("짝수의 개수는 %d개 입니다." , cnt); 
	}
	
	// 매개변수로 문자열을 입력받아서 문자 하나씩을 추출하여 출력하고 싶다면?
	public void splitString(String str) {
		System.out.println("args -> " + str);
		
		for(int idx = 0 ; idx < str.length() ; idx++) {
			System.out.print(str.charAt(idx)+"\t"); 
		}
		
 	}
	
	// 스캐너를 이용해서 값을 입력받고 1부터 차례로 누적하여 합을 구하다가 입력한 값을 넘으면 중단하고
	// 마지막으로 더해진 값과 그 때까지의 합을 출력하고 싶다면?
	// 입력예)   100 
	// 출력예시)  20 104
	
	public void sumBreak() {
		Scanner scan = new Scanner(System.in);
		System.out.print("데이터를 입력하세요 : ");
		int number = scan.nextInt();
		int idx = 0 , sum = 0 ; 
		
		for(idx = 1 ; ; idx++) {
			if(sum > number) {
				break;
			}
			sum += idx ; 
		}
		
		System.out.println(idx-1+"\t"+sum);  
		
	}
	
	public void nestedFor() {
		for(int row = 1 ; row <= 10 ; row++) {
			// System.out.println("row idx = " + row);
			for(int col = 1 ; col <= 10 ; col++) {
				// System.out.print(col+"\t");
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void gugudan() {
		for(int dan = 2 ; dan <= 9 ; dan++) {
			System.out.printf(">>>> %d 단 <<<< " , dan);
			System.out.println();
			for(int number = 1 ; number <= 9 ; number++) {
				System.out.print(dan + " * " + number + " = " + (dan*number)+"\t");
			}
			System.out.println();
		}
	}
	
	public void gugudanTable() {
		for(int dan = 2 ; dan <= 9 ; dan++) {
			System.out.printf(">>>> %d 단 <<<< " , dan);
			System.out.println();
			gugudanTimes(dan);
		}
	}
	
	private void gugudanTimes(int dan) {
		for(int number = 1 ; number <= 9 ; number++) {
			System.out.print(dan + " * " + number + " = " + (dan*number)+"\t");
		}
		System.out.println();
	}
	
	// i, j 변수만 출력(5 * 5) 
	public void printIJ() {
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.println("row = " + i + " , col = " + j);
				// System.out.print(j);
			}
			System.out.println();
		}
	}
	/*
	출력예시)
	23456
	34567
	45678
	56789
	678910 
	*/
	public void forLine() {
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
	
	// break , continue 
	// break    : 가장 가까운 루프구문을 빠져나가는 것. 
	// continue : 조건에 만족할 경우 실행을 하지않고 다음 차례로 이동  
	public void gugudan02() {
		for(int dan = 1 ; dan <= 9 ; dan++) {
			System.out.printf(">>>> %d 단 <<<< " , dan);
			System.out.println();
			for(int number = 2 ; number <= 9 ; number++) {
				
				if(number == 5) {
					continue ;
				}
				
				System.out.print(number + " * " + dan + " = " + (dan*number)+"\t");
				
//				if(number == 5) {
//					break; 
//				}
				
			}
			System.out.println();
		}
	}
	
	public void forLabel() {
		outer : 
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= 5 ; j++) {
				if(j == 3) {
					break outer ;  
				}
				System.out.println("i, j = "+i+"\t"+j);
			}
		}
	}
	
	// while 
	public void whileOneToTen() {
		int idx = 1 ; 
		while( idx <= 10 ) {
			System.out.print(idx+"\t");
			
			idx++ ;
		}
	}
	
	// 스캐너로부터 문자열을 입력받아서 for, while 구문으로 입력된 문자열의 각 문자의 인덱스와 문자를 쌍으로 출력
	// 입력예시) java
	// 출력예시) 
	// 0 : j
	// 1 : a
	// 2 : v
	// 3 : a
	public void printStrIdx() {
		Scanner scan = new Scanner(System.in);
		System.out.print("데이터를 입력하세요 : ");
		String str = scan.nextLine() ; 
		System.out.println(">>> for <<<");
		for(int idx = 0 ; idx < str.length() ; idx++) {
			System.out.println(idx+"\t"+str.charAt(idx));
		}
		
		System.out.println(">>> while <<<");
		int idx = 0 ; 
		while(idx < str.length()) {
			System.out.println(idx+"\t"+str.charAt(idx));
			idx++ ; 
		}
		
	}
	
	public void doWhileTest() {
		System.out.println("do ~ while");
		do {
			System.out.println("false 이지만 한번은 무조건 수행!! ");
		} while(false) ;
	}
	
}






































