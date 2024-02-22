import java.util.Random;

public class SelectSortMain {

	public static void main(String[] args) {
	
		// step01. 10개의 방을 가지는 배열 만들고 랜덤하게(1 ~ 100) 값으로 초기화 후 정렬전 출력
		int [] ary = new int[10];
		for(int idx = 0; idx < ary.length; idx++) {
			ary[idx] = (int)(Math.random() * 100) + 1;
		}
		aryPrt(ary);
		// step02. 초기화된 배열로부터 최소값이 들어있는 인덱스를 리턴받아보자
		int minIdx = findMinidx(ary);
		System.out.println();
		// System.out.println("최소값을 가지는 배열의 인덱스 : " + minIdx);
		// System.out.println("최소값                   : " + ary[minIdx]);
		for(int idx = 0; idx < ary.length; idx++) {
			System.out.print(ary[idx] + "\t");
		}
		System.out.println();
	}
	
	public static int findMinidx(int [] ary) {
		/* case01.
		int minIdx = 0;
		for(int idx = 1; idx < ary.length; idx++) {
			if(ary[minIdx] > ary[idx]) {
				minIdx = idx;
			}
		}
		return minIdx;
		*/
		
		// case02.
		for(int i = 0; i < ary.length - 1; i++) {
			int minIdx = i;
			for(int j = i+1; j < ary.length; j++) {
				// 인덱스 변경 
				if(ary[minIdx] > ary[j]) { // ary[minIdx] 0번째고 , ary[j]는 1번째다
					minIdx = j;
				}
			}
			// 데이터 스왑까지 생각해 본다면?
			// 최소값으로 정렬
			int temp = ary[i]; // 현재 위치(i)에 있는 값을 temp라는 임시 변수에 저장
			ary[i] = ary[minIdx]; // 현재 위치(i)에 최소값을 넣는다. 즉, 최소값을 현재 위치로 옮긴다.
			ary[minIdx] = temp; 
			// 최소값이 있던 위치에는 이전에 현재 위치에 있던 값을 넣어준다. 
			// 이렇게 하면 최소값을 현재 위치로 옮기고, 기존의 값은 최소값이 있던 위치로 이동한다.
			
			/*
			 * 즉, 이 세 줄의 코드는 현재 위치(i)의 값과 최소값을 가진 위치(minIdx)의 값을 
			 * 서로 교환하여 최소값을 현재 위치로 옮기는 작업을 수행한다.
			 */
		}
		
		return 0;
	}
	
	// 정렬 전 배열의 값을 출력.....
	public static void aryPrt(int [] ary) {
		System.out.println(">>>> 정렬 전 출력 ");
		for(int idx = 0; idx < ary.length; idx++) {
			System.out.print( ary[idx] + "\t");
		}
	}
	
	// 최소값 출력
	// 내가 한거
//	public static int findMinidx(int [] ary) {
//		int min = ary[0];
//		int minIdx = 0;
//		
//		for(int idx = 0; idx < ary.length; idx++) {
//			if (ary[idx] < min) {
//				min = ary[idx];
//				minIdx = idx;
//			}
//		}
//		System.out.println();
//		System.out.println(">>>> 최소값: " + min + " 인덱스 방: " + minIdx);
//		return min;
//	}

	

}
