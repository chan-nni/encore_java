package com.encore.post.view;

import java.util.Scanner;

import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;

public class PostView {
	
	// 참조타입의 멤버변수
	private PostService 	service ; 
	private PostRequestDTO 	params ; 
	
	// 생성자 오버로딩
	public PostView() {
	}
	public PostView(PostService service, PostRequestDTO params) {
		this.service = service ; 
		this.params  = params  ;
	}

	
	public void menu() {
		Scanner scan = new Scanner(System.in) ; 
		while(true) {
			System.out.println(">>>> Hanwha software camp Beyond 5th <<<<");
			System.out.println("1. login");
			System.out.println("2. join");
			System.out.println("3. post write");
			System.out.println("4. post delete");
			System.out.println("99. exit");
			System.out.print("input number : ");
			int number = scan.nextInt(); 
			
			if(number == 99) {
				System.exit(0);
			}
			if(number == 3) {
				requestSave() ; 
			}
			if(number == 4) {
				requestDelete() ; 
			}
			
		}
	}
	
	public void requestSave() {
		System.out.println("debug >>>> client post view"); 
		Scanner scan = new Scanner(System.in) ; 
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("제목   : ");
		String title = scan.nextLine();
		System.out.print("내용   : ");
		String content = scan.nextLine();
		System.out.print("조회수  : ");
		int cnt = scan.nextInt();
		System.out.print("공개여부 : ");
		boolean isFlag = scan.nextBoolean();
		// view has a service
		
		//PostService service = new PostService();
		//service.savePost(id, title, content, cnt, isFlag) ; 
		
		//PostRequestDTO request  = new PostRequestDTO(id, title, content, cnt, isFlag) ; 
		params.setId(id); 
		params.setTitle(title); 
		params.setContent(content); 
		params.setCnt(cnt); 
		params.setFlag(isFlag);
		String msg = service.savePost(params) ;
		
		System.out.println("Result >>>> "+msg); 
	}
	
	/*
	 request delete
	 terminal 부터 사용자의 아이디만 입력받아서 
	 해당 아이디를 dto 담고 
	 PostService 클래스에 정의된 deletePost(PostRequestDTO params) 
	 메서드를 호출하여 '작성하신 글이 삭제되었습니다' 메시지를 반환 받아서 출력
	*/
	public void requestDelete() {
		System.out.println("debug >>>> client post delete view");
		System.out.println();
		
		Scanner scan = new Scanner(System.in) ; 
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		
		//PostRequestDTO request  = new PostRequestDTO(id) ; 
		//PostService service = new PostService();
		params.setId(id);
		String msg = service.deletePost(params) ; 
		System.out.println("Result >>>> "+msg); 
	
	}
	
	
}










