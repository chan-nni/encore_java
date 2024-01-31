import java.io.IOException;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
//		int inputData = 0 ;
//		try {
//			System.out.println("데이터를 입력하세요 : ");
//			inputData = System.in.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
//		System.out.println("Result >>> "+inputData);
		
		Scanner scan = new Scanner(System.in) ; 
		System.out.println("아이디 : ");
		String id = scan.nextLine();
		System.out.println("client input data "+id); 
	}

}







