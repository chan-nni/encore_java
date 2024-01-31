package com.encore.vending;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@Getter
@RequiredArgsConstructor

public class VendingMachine {
	
	public static final int COLA      = 800 ; 
	public static final int WATER     = 500 ;
	public static final int VITAWATER = 1500 ;
	
	@NonNull
	private String 	type ;
	//
	private int		money , number ; 
	
	public void init() {
		switch(type) {
			case "if" :
				ifVending();
				break;
			case "switch" :
				switchVending();
				break;
		}
	}
	
	private void menu() {
		Scanner scan = new Scanner(System.in);
		// 금액 입력
        System.out.println("금액을 입력하세요.");
        money = scan.nextInt();
        // 메뉴 입력
        System.out.println("메뉴를 고르세요");
        System.out.print("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원) >> ");
        number = scan.nextInt();
	}
	
	private void ifVending() {
		System.out.println(">>>> if 구현");
		menu();
		if (number == 1 && money >= COLA) {
			money -= COLA ; // meney = money - COLA ;  
		}else if(number == 2 && money >= WATER) {
			money -= WATER ;
		}else if(number == 3 && money >= VITAWATER){
			money -= VITAWATER ;
		}else {
			System.out.println("잔액이 부족합니다."); 
		}
		System.out.println("잔돈 : "+money+"원"); 
		// %d, %f, %s
		System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개" , 
				(money/1000) , 
				((money%1000)/500), 
				(((money%1000)%500)/100));
		
	}
	private void switchVending() {
		System.out.println(">>>> switch 구현");
		menu();
		int price = 0 ;
		switch(number) {
			case 1 : 
				price = COLA ; 
				break;
			case 2 : 
				price = WATER ; 
				break;
			case 3 : 
				price = VITAWATER ; 
				break;
		}
		if(money < price) {
			System.out.println("잔액이 부족합니다."); 
		}else {
			money -= price ; 
		}
	
		System.out.println("잔돈 : "+money+"원"); 
		// %d, %f, %s
		System.out.printf("천원 : %d개, 오백원 : %d개, 백원 : %d개" , 
				(money/1000) , 
				((money%1000)/500), 
				(((money%1000)%500)/100));
	}
}










