import java.util.Arrays;

public class TwoAryMain {

	// 2차원 배열은 배열의 배열
	// 선언 방법 : int [][] numAry, int numAry [][]
	public static void main(String[] args) {
		int [][] numAry = { {1,2,3}, {4,5,6}, {7,8} }; // 열이 같아야 정방향 배열이다. 마지막 열이 2개이기 때문에 정방향이 아님.
		System.out.println("length : " + numAry.length);
		System.out.println("numAry[0] : " + numAry[0].length);
		System.out.println("numAry[1] : " + numAry[1].length);
		System.out.println("numAry[2] : " + numAry[2].length);
		
		/*
		for(int i =0; i < numAry.length; i++) {
			for(int j = 0; j < numAry[i].length; j++) {
				// System.out.print(numAry[i][j] + "\t");
				System.out.print("i = " + i + ", j = " + j + " " + numAry[i][j] + "\t");
			}
			System.out.println();
		}
		*/
		
		// 구구단의 결과를 2차원 배열에 담는다면?
		// 출력예시) 
		// 2단 2 4 .... 18
		// 3단 3 6 .... 27
		
		int [][] gugudanAry = new int [8][9];
		
		for(int i = 2; i <= 9; i++) {
			// System.out.print(i + "단 : ");
			for(int j = 1; j <= 9; j++) {
				// System.out.print((i*j) + "\t");
				gugudanAry[i-2][j-1] = (i*j);
			}
			// System.out.println();
		}
		System.out.println("2차원 배열에 담긴 값 출력 ---");
		for(int i = 0; i < gugudanAry.length; i++) {
			System.out.print((i+2) + "단 : ");
			// System.out.println( Arrays.toString(gugudanAry[i]) );
			for (int j = 0; j < gugudanAry[i].length; j++) {
				System.out.print(gugudanAry[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
