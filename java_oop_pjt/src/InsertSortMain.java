import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InsertSortMain {

	public static void main(String[] args) {
		
		int [] ary = new int[10];
		for(int i = 0; i < ary.length; i++) {
			ary[i] = (int)(Math.random() * 100) + 1;
			for(int j = 0; j < i; j++) {
				if( ary[j] == ary[i] ) {
					i--;
					break;
				}
			}
		}
		// 선택 정렬
		Arrays.sort(ary);
		aryPrt(ary);
		
		int insertData = 0;
		
		// 입력하고자하는 데이터가 중복이 아닌 데이터만 생성해서 전달
		// 로또 코드 참조? 
		// 구현
		System.out.println();
		for(int i = 0; i < ary.length; i++) {
			insertData = (int)(Math.random() * 100) + 1;
			for(int j = i; j < i; j++) {
				if( ary[j] == insertData) {
					i--;
					break;
				}
			}
		}
		System.out.println("insert data : " + insertData);
		
		int insertIdx = findInsertIdx(ary, insertData);
		// int insertIdx = findInsertIdx(ary, 50);
		System.out.println();
		System.out.println("데이터가 들어갈 배열의 인덱스 : " + insertIdx);

	}
	
	// 정렬된 배열에서 특정 데이터가 들어갈 번지를 반환.....
	public static int findInsertIdx(int [] ary, int data) {
		int findIdx = -1;
		
		for(int i = 0; i < ary.length; i++) {
			
			if(ary[i] > data) {
				findIdx = i; // data보다 큰 값을 만나면 해당 인덱스를 저장하고 탐색을 종료
				break;
			}
		}
		
		// 만약 데이터가 배열의 모든 값보다 크다면 맨 끝에 삽입
		if (findIdx == -1) {
			return ary.length;
		}
		
		return findIdx;
	}
	
	// 정렬 전 배열의 값을 출력.....
	public static void aryPrt(int [] ary) {
		System.out.println(">>>> 정렬 전 출력 ");
		for(int idx = 0; idx < ary.length; idx++) {
			System.out.print( ary[idx] + "\t");
		}
	}

}
