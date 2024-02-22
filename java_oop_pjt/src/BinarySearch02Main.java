/*
입력예시) 떡의 개수(N)와 요청한 떡의 길이(M)  
4 6

19 14 10 17 (떡의 개별 높이)

4   0  0  2

출력조건)
절단기의 길이는 가장 긴 떡의 길이
적어도 M만큼의 떡을 집에 가져가기 위해 절단기를 설정할 수 있는 높이의 최대값 출력
출력예시)
15
*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch02Main {
	public static void main(String[] args) {
		System.out.print("떡의 개수(N)와 요청한 떡의 길이(M) 입력 : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt() ;
		int m = scan.nextInt() ;
		Integer [] cakesAry = new Integer[n] ;
		for(int i = 0 ; i < cakesAry.length ; i++) {
			cakesAry[i] = scan.nextInt() ;
		}
		int result = search(cakesAry, m);
		if(result == -1) {
			System.out.println("절단 실패");
		}else {
			System.out.println("절단기 설정 최대 값 : " + result ); 
		}
	}
	
	public static int search(Integer[] ary, int target) {
        int result = -1;
        
        Arrays.sort(ary, Collections.reverseOrder());// 내림차순
        int low = 0;
        int high = ary[0];
        System.out.println("low " + low + " high " + high);
		while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("mid >>>>> " + mid);
            
            int cnt = 0; // 절삭기에 의해서 잘린 total이다.
            for(int cake : ary) {
            	if(cake > mid) {
            		cnt += (cake - mid);
            		System.out.println("cake " + cake + "\t mid " + mid);
            	}
            }
            System.out.println("cnt : " + cnt);
            if(target == cnt) {
            	result = mid;
            	break;
            } else if(target < cnt) {
            	low = mid + 1;
            } else {
            	high = mid - 1;
            }
        }

        return result;
	}
}