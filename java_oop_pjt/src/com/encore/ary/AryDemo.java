package com.encore.ary;

import java.util.Scanner;

public class AryDemo {

	public AryDemo() {
	}
	
	// Scanner 를 이용해서 5명의 학생들의 국어점수만 입력받은 점수를 배열에 담아서 반환하고 싶다면? 
	public int [] makeScores() {
		int[] scoreAry = new int[5]; // 지역변수
		System.out.println("ary address : " + scoreAry);
	
		Scanner scan = new Scanner(System.in);
		
		for(int idx = 0; idx < scoreAry.length; idx++) {
			System.out.println((idx+1) + "번 째 학생의 점수를 입력하세요 : ");
			scoreAry[idx] = scan.nextInt();
		}
		
		return scoreAry;
	}
	
	public void scorePrint(int [] ary) {
		int sum = 0, avg = 0;
		for(int idx = 0; idx < ary.length; idx++) {
			sum += ary[idx];
		}
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (sum / ary.length) );
	}
	
	
	
	
	
}
