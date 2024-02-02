import com.encore.hms.domain.EmployeeDTO;
import com.encore.hms.domain.StudentDTO;
import com.encore.hms.domain.TeacherDTO;

public class OopExtendsMain {

	public static void main(String[] args) {
		// 객체 생성
		StudentDTO stu02 = new StudentDTO("강찬미", 23, "강북구", "2020");
		System.out.println(stu02.personInfo());
		System.out.println(stu02.studentInfo());
		
		TeacherDTO tea01 = new TeacherDTO("강찬미", 23, "강북구", "자바");
		System.out.println(tea01.personInfo());
		System.out.println(tea01.teacherInfo());
		
		EmployeeDTO emp01 = new EmployeeDTO("강찬미", 23, "강북구", "운영팀");
		System.out.println(emp01.personInfo());
		System.out.println(emp01.employeeInfo());
		
	}

}
