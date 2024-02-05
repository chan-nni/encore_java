import com.encore.hms.service.HmsService;

// 1. stu, 2. tea, 3. emp
public class HmsMain {

	public static void main(String[] args) {
		HmsService service = new HmsService(10); // 배열도 같이 생성
		String msg = service.makePerson(1, "강찬미", 20, "서울", "1992");
		// 출력 예시) 학생|강사|직원 객체를 배열에 담았습니다.
		System.out.println(msg);
		msg = service.makePerson(2, "강찬미", 20, "서울", "자바");
		System.out.println(msg);
		msg = service.makePerson(3, "강찬미", 20, "서울", "교육 서비스팀");
		System.out.println(msg);

	}

}
