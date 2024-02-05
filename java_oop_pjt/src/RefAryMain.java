import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;
import com.encore.hms.domain.sup.Person;

public class RefAryMain {

	public static void main(String[] args) {
		/*
		 * 배열이란? (Collection)
		 * - 객체로 취급, [], 0 ~, length, 고정길이, sameType 만 담는다.
		 * - sameType : 같은 데이터 타입만 담는다.
		 * - 배열에 담을 수 있는 요소의 타입(기본, 참조)
		 * 
		 * int [] ary ; -- 선언
		 * int [10] ary ; -- error 배열 선언 시 길이 고정은 안됨
		 * ary = new int[10] -- 배열 생성(10개의 방을 가지는)
		 * String [] ary = {} ;
		 * String [] ary = new String[10]{} -- error
		*/
		
		// 학생 객체 30명을 만들어서 관리하고 싶다면?
		// EmployeeDTO emp01, emp02, emp03 .... emp30 ;
		// ctrl + shift + o -- import
		int idx = 0;
		StudentDTO [] empAry = new StudentDTO [30]; // 배열 객체 생성
		empAry[idx++] = new StudentDTO("강찬미", 20, "서울", "2020"); // Student 객체를 만들어서 배열의 0번 째 방에 담는다.
		/* empAry[idx++] = new EmployeeDTO("강찬미", 20, "서울", "2020"); -- error, same Type 위배 */
		
		// 만약, 학생 강사 직원 객체를 담는 배열을 사용하고자 한다면?
		// 우리는 3개의 배열을 만들어야 한다.
		// 변수의 다형성이 적용된다면? - 1개
		/* StudentDTO stu = new StudentDTO(); // 생성자 호출을 통한 객체 생성; */
		Person stu = new StudentDTO(); 
		// 부모의 타입이 더 크기 때문에 부모 타입으로 Student에 객체를 생성할 수 있다.
		// 상속의 다형성
		// 하지만, 자식에 대한 접근은 불가하다. 부모 타입으로 생성했기 때문에 부모에만 접근 가능.
		// 캐스팅을 통하면 부모 타입이더라도 자식에 대한 접근이 가능하다.
		// stu.setStuId("2000"); -- error 부모타입은 자식에 접근할 수 없다.
		// ((StudentDTO)stu).setStuId("2000"); -- 캐스팅을 통해 자식의 구성요소에 접근
		
		// 타입의 다형성을 배열에 적용한다면?
		
		int perIdx = 0;
		Person [] perAry = new Person [10];
		perAry[perIdx++] = new StudentDTO("강찬미", 20, "서울", "2020");
		perAry[perIdx++] = new TeacherDTO("강찬미", 20, "서울", "자바");
		perAry[perIdx++] = new EmployeeDTO("강찬미", 20, "서울", "교육운영팀");
		
		System.out.println("ary person idx = " + perIdx);
		for(int i = 0; i < perAry.length; i++) {
			Person per = perAry[i];
//			if (per instanceof StudentDTO) { // 런타임 시점에 배열이 가지고 있는 요소에 타입을 체크하는 연산자 instanceof 런타임 시점에 타입을 체크해준다. 부모 타입이지만 까고 보면 student. 이것이 타입의 다형성
//				StudentDTO obj = (StudentDTO) per;
//				System.out.println(obj.studentInfo());
//			}
//			if (per instanceof TeacherDTO) {
//				TeacherDTO obj = (TeacherDTO) per;
//				System.out.println(obj.teacherInfo());
//			}
//			if (per instanceof EmployeeDTO) {
//				EmployeeDTO obj = (EmployeeDTO) per;
//				System.out.println(obj.employeeInfo());
//			} 
			
			if(per == null) {
				break;
			}
			System.out.println(per.personInfo());
			
		}// end for
		
		System.out.println(">>> main demen thread end <<<");
		
	} // end main

}
