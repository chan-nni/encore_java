import com.encore.ary.AryDemo;

public class AryDemoMain {

	public static void main(String[] args) {
		
		/*
		 * // AryDemo에서 구현된 메서드 호출하고 싶다면? AryDemo demo = new AryDemo(); int [] ary =
		 * demo.makeScores(); System.out.println("ary address : " + ary);
		 * 
		 * // 배열을 전달하여 총 합과 평균을 출력하고 싶다면? demo.scorePrint(ary);
		 */

		/*
		 * System.out.println(">>> 랜덤 카드 게임 <<< "); String [] shapes = {"spade",
		 * "clover", "heart", "diamond"} ; String [] numbers = {"1", "2", "3", "4", "5",
		 * "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
		 * 
		 * int shapeIdx = (int)(Math.random() * shapes.length); int numberIdx =
		 * (int)(Math.random() * numbers.length);
		 * 
		 * System.out.println("뽑은 카드는 : " + shapes[shapeIdx] + " " + numbers[numberIdx]
		 * + "입니다.");
		 */
		
		System.out.println("주민번호를 입력받아서 성별자리 이후부터 * 로 가려서 출력하고 싶다면?");
		System.out.println("출력예시)730910-*******");
		String ssn = "730910-1234567";
		
		char [] charAry = ssn.toCharArray();
		System.out.println("ary length : " + charAry.length);
		System.out.println("ary gender : " + charAry[7] );
		
		for(int idx = 0; idx < charAry.length; idx++) {
			if(idx > 7) {
				charAry[idx] = '*';
			}
		}
		System.out.println("Result : ");
		for(int idx = 0; idx < charAry.length; idx++) {
			System.out.print(charAry[idx]);
		}
		
	}

}
