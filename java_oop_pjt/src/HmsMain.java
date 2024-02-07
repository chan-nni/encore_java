import com.encore.hms.view.HmsView;

// 1. stu, 2. tea, 3. emp
// enum

public class HmsMain {

	public static void main(String[] args) {
		/*
		HmsService service = new HmsService(10); // 배열도 같이 생성
		String msg = service.makePerson(HmsType.TEA, "강찬미", 20, "서울", "1992");
		// 출력 예시) 학생|강사|직원 객체를 배열에 담았습니다.
		System.out.println(msg);
		msg = service.makePerson(HmsType.TEA, "강찬미", 20, "서울", "자바");
		System.out.println(msg);
		msg = service.makePerson(HmsType.EMP, "강찬미", 20, "서울", "교육 서비스팀");
		System.out.println(msg);
		*/
		HmsView view = new HmsView(); // 메인에서 메뉴판 호출
		view.mainMenu();
	}

}
