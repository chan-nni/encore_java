import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.encore.compare.EncoreInteger;

public class CompareSubMain {

	public static void main(String[] args) {

		EncoreInteger[] ary = new EncoreInteger[10];
		
		System.out.println("정렬 전의 데이터 출력");
		for(int i=0 ; i < ary.length ; i++) {
			ary[i] = new EncoreInteger((int)(Math.random()*100 +1) );
			System.out.print(ary[i].getData() + " ");
		}
		
		System.out.println("\n정렬 후의 데이터 출력");
		
		Arrays.sort(ary,Comparator.reverseOrder());
		// 배열안에 객체가 들어있어도 객체 안의 요소를 자동으로 비교한다.
		// 단 그 객체가 Comparator이나 Comparable인터페이스를 구현하고 있어야한다.
		
		for(EncoreInteger e : ary) {
			System.out.print(e.getData() + " ");
		}
		
	}

}