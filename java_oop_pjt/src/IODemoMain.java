import java.io.IOException;

import com.encore.stream.IODemo;

/* byte - short - int - long -float - double */
/* char, boolean */
public class IODemoMain {

	public static void main(String[] args) {
		IODemo demo = new IODemo();
		/*
		String msg = null;
		try {
			msg = demo.inputStr();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(msg);
		String [] strAry = msg.split(" "); // split : 공백을 기준으로 토큰(배열로 반환)시켜줌
		System.out.println("length : " + strAry.length);
		int sum = 0;
		for(String data : strAry) {
			sum += Integer.parseInt(data); // 문자가 아닌 정수로 계산
		}
		System.out.println(sum);
		*/
		
		// case 02.
//		int data = demo.inputInt();
//		System.out.println(data);
//		System.out.println();
//		System.out.println(">>>> main end <<<<");
		
		// case 03.
//		try {
//			demo.first(0);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(">>>> main end <<<<");
		
		// case 04.
//		String msg = "aBc";
//		System.out.println(msg.equals("abc"));
//		System.out.println(msg.equalsIgnoreCase("abc")); // 대소문자 구분하지 않고 비교
//		System.out.println(msg.toUpperCase()); // 대문자 변환
//		System.out.println(msg.toLowerCase()); // 소문자 변환
//		System.out.println(msg.length()); // 문자 길이
//		System.out.println(msg.contains("B")); // 포함하는지 비교, 대소문자 구분함
//		System.out.println(msg.startsWith("a")); // 시작하는 문자 비교
//		System.out.println(msg.endsWith("c")); // 끝나는 문자 비교
//		msg = "a b c";
//		System.out.println(msg.trim());
//		System.out.println(msg.trim().length()); // 공백 포함 문자 길이
//		msg = "abcdef";
//		System.out.println(msg.charAt(1)); // 원하는 문자 가져옴
//		System.out.println(msg.substring(2)); // 2번째 인덱스 번호부터 가져옴
//		System.out.println(msg.substring(2, 5)); // substring에 마지막 인덱스는 -1이 들어간다. 그래서 cde 출력
//		
		
		// case 05.
//		boolean flag = demo.outputFile();
//		String msg = (flag == true) ? "저장성공" : "저장실패";
//		System.out.println(msg);
		
		// case 06.
//		boolean flag = demo.outputObjFile();
//		String msg = (flag == true) ? "저장성공" : "저장실패";
//		System.out.println(msg);
		
		// case 07.
		// demo.outputSerializable();
		demo.inputSerializable();
		
	}

}
