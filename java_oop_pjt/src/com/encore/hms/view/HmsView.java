package com.encore.hms.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;
import com.encore.hms.service.HmsService;
import com.encore.hms.util.HmsType;

public class HmsView {

	public static Scanner scan = new Scanner(System.in) ;
	// static이기 때문에 인스턴스가 아니라 클래스 소유
	
	// HmsView는 HmsService의 의존선 주입(Dependency Injection) 관계가 형성
	// 즉, HmsView는 HmsService의 객체 생성을 통한 접근을 필요로 하는 것.
	
	private HmsService service; // 이 변수는 클래스 전역에 쓸 수 있다.
	
	public HmsView() {
		service = new HmsService(10); // 서비스랑 관계를 가짐 인자 받으니까 스페셜 컨스럭쳐
	}
	
	public void mainMenu() {
		service.loadToFile();
		while(true) {
			System.out.println(">>> HMS Ver1.0 <<<");
			System.out.println("1.  전체출력");
			System.out.println("2.  이름으로 검색");
			System.out.println("3.  이름으로 찾아서 수정");
			System.out.println("4.  이름으로 찾아서 삭제");
			System.out.println("5.  생성");
			System.out.println("99. 종료");
			System.out.print("Input Number : ");
			try {
				int number = scan.nextInt();
				switch (number) {
					case 1 : 
						perPrint() ;
						break ;
					case 2 :
						search();
						break;
					case 3 :
						update();
						break;
					case 4 :
						remove();
						break;
					case 5 :
						subMenu() ;
						break ;
					case 99 :
						System.out.println("데이터를 저장(Y/N) 하시겠습니까? ");
						String confirmYN = scan.next();
						if(confirmYN.equalsIgnoreCase("y")) {
							service.saveToFile();
							System.out.println("데이터 저장 완료!!");
						} else {
							System.out.println("프로그램을 종료합니다. 데이터는 보관되지 않습니다.");
						}
						System.exit(0);
					default :
						System.out.println("메뉴에 정의된 숫자만 입력해 주세요. PLZ ");
				
				} // switch end block 
			} catch(InputMismatchException e) { 
				System.out.println("숫자만 입력하세요...");
				scan.nextLine();
			}
		} // while end block
	} // main menu end block
	
	/*
	 * Scanner 객체를 이용해서 찾고자하는 이름을 입력받아사ㅓ
	 * 존재할 경우 해당 객체의 정보를 출력하고
	 * 존재하지 않을 경우 '정보가 존재하지 않습니다.' 라는 메시지를 출력
	 * HmsView - HmsService(seachPerson(String name))
	 * */
	
	public void search() {
		System.out.println();
		System.out.println(">>> seach <<<");
		System.out.println("이름을 입력하세요 : ");
		scan.nextLine();
		String name = scan.nextLine();
		Person person = service.searchPerson(name);
		if(person == null) {
			System.out.println("정보가 존재하지 않습니다.");
		} else {
			System.out.println(person.personInfo());
		}
	}
	
	/*
	 * Scanner 객체를 이용해서 찾고자하는 이름을 입력받아사
	 * 존재할 경우 해당 객체의 학생-학번, 강사-과목, 직원-부서를 수정하고
	 * '정보를 수정하였습니다' 라는 메시지 출력
	 * 존재하지 않을 경우 '정보가 존재하지 않습니다.' 라는 메시지를 출력
	 * HmsView - HmsService(updatePerson(String name))
	 * */
	
	public void update() {
		System.out.println();
		System.out.println(">>> update <<<");
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		
		Person obj = service.updatePerson(name);
		
		if(obj != null) {
			if (obj instanceof StudentDTO) {
				System.out.println("수정할 학번을 입력하세요 : ");
				String stuId = scan.next(); // 공백 포함 안됨, 공백 포함하려면 nextLine() 사용
				((StudentDTO) obj).setStuId(stuId); // studentDTO로 obj를 캐스팅한다. stuId는 자식것이기 때문에 obj가 접근 불가 그래서 sudent로 캐스팅함.
			}
			if (obj instanceof TeacherDTO) {
				System.out.println("수정할 과목을 입력하세요 : ");
				String subject = scan.next();
				((TeacherDTO) obj).setSubject(subject);
			}
			if (obj instanceof EmployeeDTO) {
				System.out.println("수정할 부서를 입력하세요 : ");
				String dept = scan.next();
				((EmployeeDTO) obj).setDept(dept);
			}
		} else {
			System.out.println("정보가 존재하지 않습니다.");
		}
		
        // 수정 후 정보 출력
        System.out.println("수정된 정보: " + obj.personInfo());
    }
	

	/*
	 * Scanner 객체를 이용해서 찾고자하는 이름을 입력받아사
	 * 존재할 경우 해당 객체를 배열에서 삭제하고
	 * '객체를 삭제하였습니다' 라는 메시지 출력
	 * 그리고
	 * 전체 출력을 했을 때 정상적으로 출력되면 OK
	 * HmsView - HmsService(removePerson(String name))
	 * */
	
	public void remove() {
		System.out.println();
		System.out.println(">>> remove <<<");
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		
		Person person = service.searchPerson(name);
		
		if(person == null) {
			System.out.println("정보가 존재하지 않습니다.");
		} else {
			boolean flag = service.removePerson(name);
			if (flag == true) {
				System.out.println("객체를 삭제하였습니다.");
			} else {
				System.out.println("이유를 모르겠지만 작업 수행 미이행.");
			}
			
		}
		
	}
	
	public void perPrint() {
		System.out.println();
		System.out.println(">>> 전체 출력 <<<");
		
		Person [] perAry = service.getAry();
		if(service.getIdx() == 0) {
			System.out.println();
			System.out.println(">>> 데이터가 존재하지 않습니다. <<<");
			System.out.println();
		} else {
			
			for(int idx = 0; idx < perAry.length; idx++) {
				Person per = perAry[idx];
				if(per == null) {
					break;
				}
				System.out.println(per.personInfo());
			}
			//////// or
			/*
			for(Person per : perAry) {
				System.out.println(per.personInfo());
			}
			*/
		}
	}
	
	public void subMenu() {
		while (true) {
			System.out.println(">>> 객체 생성을 위한 Sub Menu <<<");
			System.out.println("1.  학생");
			System.out.println("2.  강사");
			System.out.println("3.  직원");
			System.out.println("99. 상위메뉴 이동");
			System.out.print("Input Number : ");
			int number = scan.nextInt() ;
			switch (number) {
				case 1 : 
				case 2 :
				case 3 :
					makePerson(number) ;
					break ;
				case 99 :
					return ;
			} // switch end block 
		}
	}
	
	public void makePerson(int number) {
		System.out.println();
		System.out.println(">>> 객체 생성 <<<");
		
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("주소를 입력하세요 : ");
		String address = scan.nextLine();//공백 포함하느 문자 받으려면 nextline 사용
		
		/*
		String common = (number == 1) ? 
					"학번을 입력해주세요." : (number == 2) ? 
							"과목을 입력해주세요." : "부서를 입력해주세요.";
		System.out.println(common + " ");
	    String comn =scan.nextLine();
		*/
		
		String comm = null;
		String msg = null;
		switch(number) {
			case 1 :
				System.out.println("학번을 입력해주세요 : ");
				comm = scan.nextLine();
				msg = service.makePerson(HmsType.STU, name, age, address, comm);
				break;
			case 2 :
				System.out.println("과목을 입력해주세요 : ");
				comm = scan.nextLine();
				msg = service.makePerson(HmsType.TEA, name, age, address, comm);
				break;
			case 3 :
				System.out.println("부서를 입력해주세요 : ");
				comm = scan.nextLine();
				msg = service.makePerson(HmsType.EMP, name, age, address, comm);
				break;
		}
		System.out.println(msg);
		// Scanner name, age, address, comm
		// HmsService - makePerson() 연결
	}
	
}