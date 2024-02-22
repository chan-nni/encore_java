
public class BinarySearchMain {

	public static void main(String[] args) {
		// Wrapper (int - Integer)
		// Integer i = new Integer(10); int sum = i + 10; ptint(sum)내부적으로 객체를 언박싱해줘서 가능
		// 객체비교를 통한 sorting
		// integer [] ary = new integer[10]; ary[i] == ary[j] -> 이런 주소값 비교 
		// ary[i].equals(ary[j]); -> 이건 데이터 비교
		
//		Integer [] ary = new Integer[14];
//		// Math.random() 난수 발생시키고 값을 배열에 할당.
//		for(int i = 0; i < ary.length; i++) {
//			ary[i] = (int)(Math.random() * 100) + 1; 
//		}
		
		Integer [] ary = {1, 3, 4, 5, 7, 9, 10, 11, 13, 15, 16, 18, 19, 20};
		int target = 7;
		aryPrt(ary);
		
		/*
		이진탐색 개념 정리
		- 중앙값의 인덱스를 필요
		- 찾고자하는 데이터(target)
		- low(0), high(ary.length - 1)
		- mid 값을 조절하면서 반복(재귀)
		
		종료 조건
		- 데이터 검색 성공시 종료
		- 데이터 검색 실패시 종료
		- 더 이상 검색할 데이터가 없을 경우	(반복, 재귀)
		*/
		
		/*
		int low = 0;
		int high = ary.length -1;
		int mid = low + ((low + high) / 2);
		int target = 7;
		System.out.println("mid index = " + mid + "\t" +ary[mid]);
		if(target == ary[mid]) {
			System.out.println("탐색 완료되었습니다.");
		} else if(target < ary[mid]) {
			high = mid - 1;
		} else {
			low = mid + 1;
		}
		System.out.println("low = " + low);
		System.out.println("high = " + high);
		System.out.println("찾고자하는 데이터가 중앙값보다 작아서 다시 중앙값을 조절 >>> ");
		
		mid = low + ((low + high) / 2);
		System.out.println("mid index = " + mid + "\t" +ary[mid]);
		
		if(target == ary[mid]) {
			System.out.println("탐색 완료되었습니다.");
		} else if(target < ary[mid]) {
			high = mid - 1;
		} else {
			low = mid + 1;
		}
		System.out.println("low = " + low);
		System.out.println("high = " + high);
		*/
		// int findIdx = search(ary, target);
		
		int findIdx = search(ary, target, 0, ary.length - 1);
		System.out.println("타겟 >>>>> " + target);
		
		if (findIdx != -1) {
			System.out.println("탐색 완료 : " + ary[findIdx] + " , index : " + findIdx);
		} else {
			System.out.println("탐색 실패 : " + ary[findIdx]);
		}
	}
	
	// 재귀구문 >>>>>>
	public static int search(Integer [] ary, int target, int start, int finish) {
		
		if (start >= finish) {
			return -1;
		}
	
		int mid = (finish + start) / 2;
		
		if (target == ary[mid]) {
			return mid;
//		} else if (target < ary[mid]) {
//			return search(ary, target, start, mid - 1); // 왼쪽 반쪽을 다시 탐색
//	    } else {
//	        return search(ary, target, mid + 1, finish); // 오른쪽 반쪽을 다시 탐색
//	    }
		} 
		if(target < ary[mid]) {
			return search(ary, target, start, mid - 1);
		} else {
			return search(ary, target, mid + 1, finish);
		}
	}

	// 반복구문 >>>>>>
	// return value : index
	public static int search(Integer [] ary, int target) {
		int low = 0;
		int high = ary.length -1; // 배열의 마지막 유효한 인덱스를 가리키기 위해서는 ary.length - 1
		int mid = 0;
		while(low <= high) {
			mid = low + ((high - low) / 2);
			
			if(target == ary[mid]) {
				System.out.println("탐색 완료되었습니다.");
				return mid;
			} else if(target < ary[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			} 
		}
		return -1;
	}
	
	public static void aryPrt(Integer [] ary) {
		System.out.println("정렬된 데이터 >>>>");
		for(Integer data : ary) { // 내부적으로 인덱스 관리하는 구문, 배열에 있는 요소의 타입을 Integer로 지정
			System.out.print(data + "\t");
		}
		System.out.println();
	}
	
}
