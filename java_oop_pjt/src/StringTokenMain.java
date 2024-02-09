import java.util.StringTokenizer;

import com.encore.hms.domain.StudentDTO;

public class StringTokenMain {

	public static void main(String[] args) {
		String data = "강찬미:20:서울:2020";
		
		/*
		StringTokenizer token = new StringTokenizer(data, ":");
		
		StudentDTO stu = new StudentDTO(token.nextToken(),
										Integer.parseInt(token.nextToken()),
										token.nextToken(),
										token.nextToken());
		*/
		String [] ary = data.split(":");
		StudentDTO stu = new StudentDTO(ary[0],
										Integer.parseInt(ary[1]),
										ary[2],
										ary[3]);
		
		System.out.println(stu.personInfo() );

	}

}
