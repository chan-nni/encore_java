/*
싱글 쓰레드 : 순차실행 main start - 파일 다운로드(A) - 파일 다운로드(B) - 파일 다운로드(C) - main end
멀티 쓰레드 : 병렬실행 main start - 파일 다운로드(A)(thread) - 파일 다운로드(B)(thread) - 파일 다운로드(C)(thread) - main end
ArrayList - Vector

Vector : 강제동기화로 인해서 성능에 문제가 생긴다.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemoMain {
	public static void main(String[] args) {
		/* case01
		List<Integer> lst = new ArrayList();
		List<Integer> vec = new Vector();
		
		new Thread( () ->  {
			for(int idx = 0; idx < 10000; idx++) {
				lst.add(idx); // 스레드가 리스트에 접근, not synchronized
				vec.add(idx); // synchronized
			}
		}).start();
		
		new Thread( () ->  {
			for(int idx = 0; idx < 10000; idx++) {
				lst.add(idx); // 스레드가 리스트에 접근, not synchronized
				vec.add(idx); // synchronized
			}
		}).start();
		
		// 출력 용도에 쓰레드
		new Thread( () -> {
			
			try {
				Thread.sleep(2000);
				System.out.println("ArrayList size = " + lst.size());
				System.out.println("Vector	  size = " + vec.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}).start();
		*/
		
		/* case02
		List<Integer> vec = new Vector();
		// 두 개의 쓰레드가 동일한 Vector에 접근하는 코드
		// 인스턴스 자체는 동기화가 되어있지 않기 때문에 ....
		
		new Thread( () ->  {
			
			vec.add(1); vec.add(2); vec.add(3);
			System.out.println(vec.get(0));
			System.out.println(vec.get(1));
			System.out.println(vec.get(2));
		}).start();
		
		new Thread( () ->  {
			
			vec.remove(0);
			vec.remove(0);
			vec.remove(0);
		}).start();
		
		new Thread( () -> {
			
			try {
				Thread.sleep(2000);
				System.out.println("Vector	  size = " + vec.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}).start();
		*/
		
	}
}
