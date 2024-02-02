import java.util.Random;

public class AryMain {

	public static void main(String[] args) {
		// 참조타입의 배열 선언으로 사용하기 위해서는 객체 생성이 필요하다.
		// 선언과 동시에 객체 생성 완료!!
		int [] ary = null;
		
		// 어디선가 객체 생성이 이루어져야 한다.
		ary = new int [10];
		
		System.out.println("배열의 길이 - " + ary.length);
		
		Random random = new Random();
		
		for(int idx = 0; idx < ary.length; idx++) {
			ary[idx] = random.nextInt(100) + 1;
		}
		System.out.println(">>> enhanced loop <<< ");
		for (int data : ary) { // int data : ary = 앞에 있는 변수에 배열의 첨자번째 값을 할당한다.
			System.out.print(data+"\t");
		}

	}

}
