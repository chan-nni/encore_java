import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;

public class OopMain {

	public static void main(String[] args) {
		
		// 생성된 객체를 변수에 담음
		// 참조 타입의 변수의 타입은 클래스명이여야 한다. 
		// 클래스는 객체를 만들기 위한 템플릿이며, 이 템플릿을 기반으로 실제로 메모리에 할당되어 사용될 때 그것을 인스턴스라 한다.
		StudentDTO stu01 = new StudentDTO();
		/*
		 * 접근 지정자가 private일 경우 접근을 허용하지 않는다.
		 * System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu01.name);
		 * System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu01.age);
		 * System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu01.address);
		 * System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu01.stuId);
		 * 
		 */
		
		// setter, getter 접근
		System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu01.getName());
		stu01.setName("강찬미");
		System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu01.getName());

		// 스페셜 생성자 호출을 통한 객체 생성
		System.out.println();
		System.out.println("스페셜 생성자 호출을 통한 객체 생성");
		StudentDTO stu02 = new StudentDTO("강찬미", 23, "강북구", "2020");
		System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu02.getName());
		System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu02.getAge());
		System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu02.getAddress());
		System.out.println("인스턴스 소유의 변수애 접근하여 값을 가져온다. -> " + stu02.getStuId());

		// 나이 변경
		// 마이너스 값 할당이 안되는 조건이 있어서 최조 생성된 값으로 반환된다. -100 할당안됨.
		System.out.println();
		stu02.setAge(-100);
		System.out.println("인스턴스 소유의 메서드에 접근 -> " + stu02.getAge());
		
		// 강사 객체 생성 후 정보 확인
		System.out.println();
		System.out.println("강사 객체 생성 후 정보 확인");
		TeacherDTO tea01 = new TeacherDTO("임정섭", 45, "노원구", "java");
		System.out.println("강사 객체 생성 - " + tea01); 
		// 이렇게 하면 주소값이 할당됨.
		// 결과 : 강사 객체 생성 - com.encore.hms.domain.TeacherDTO@1517365b
		// toString() 오버라이딩 한 결과 : 강사 객체 생성 - TeacherDTO [name=임정섭, age=45, address=노원구, subject=java]
		
		// 직원 객체 생성 후 정보 확인(Emloyee - name, age, address, dept)
		System.out.println();
		System.out.println("직원 객체 생성 후 정보 확인");
		EmployeeDTO eml01 = new EmployeeDTO("강찬미", 23, "강북구", "교육운영팀");
		System.out.println("강사 객체 생성 - " + eml01); 
		
	}

}
