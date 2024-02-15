import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.encore.data.structor.list.EncoreNodeList;

public class LinkedListDemoMain {

	public static void main(String[] args) throws Exception {
		
		/* List<Integer> lst = new LinkedListDemoMain(); */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		writer.write("데이터를 입력하세요 : ");
		writer.flush();
		*/
		
		System.out.println("데이터를 입력하세요 : ");
		int date = Integer.parseInt(reader.readLine());
		
		// LinkedList의 헤더를 생성하는 코드
		EncoreNodeList mgr = new EncoreNodeList(date); // 연결리스트를 생성
		// 1. 여기서 데이터를 만든다.
		
		while(true) {
			System.out.println("메뉴얼을 선택하세요 ");
			System.out.println("1. 연결리스트 데이터 출력 ");
			System.out.println("2. 연결리스트 데이터 추가 ");
			System.out.println("3. 연결리스트 데이터 삭제 ");
			System.out.println("99. 프로그램 종료 ");
			System.out.println("원하시는 번호를 입력 : ");
			int number = Integer.parseInt(reader.readLine());
			switch(number) {
				case 1 :
					System.out.println(">>> LinkedList 데이터 출력 <<<");
					mgr.desc();
					break;
				case 2 :
					System.out.println(">>> LinkedList 데이터 추가 <<<");
					int add_data = Integer.parseInt(reader.readLine()); // readLine이 스트링이여서 Integer.parseInt 인트타입으로 만들어야 한다.
					mgr.add(add_data);
					break;
				case 3 :
					System.out.println(">>> LinkedList 데이터 삭제 <<<");
					
					// 삭제할 데이터 입력
					int remove_data = Integer.parseInt(reader.readLine());
					System.out.println(mgr.remove(remove_data) ? "삭제완료" : "삭제실패"); 
					break;
					
				default :
					System.exit(0);
			}
			
		}

	}

}
