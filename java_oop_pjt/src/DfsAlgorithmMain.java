import java.util.ArrayList;
import java.util.List;

public class DfsAlgorithmMain {

	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	public static boolean [] visited = new boolean[9];
	
	public static void main(String[] args) {
		// 요소를 담을 수 있는 리스트 생성(사이즈 만큼);
		
		for(int i = 0; i < visited.length; i++) {
			graph.add(new ArrayList<Integer>()); // graph 라는 컬렉션에 ArrayList 객체 생성
		}
		
		// 1번 노드에 연결된 노드 정보 - 1번에 2,3,8 추가
		graph.get(1).add(2);graph.get(1).add(3);graph.get(1).add(8);
		// 2번 노드에 연결된 노드 정보 - 2번에 1,7 추가
		graph.get(2).add(1);graph.get(2).add(7);
		// 3번 노드에 연결된 노드 정보 - 3번에 1,4,5 추가
		graph.get(3).add(1);graph.get(3).add(4);graph.get(3).add(5);
		// 4번 노드에 연결된 노드 정보 - 4번에 3,5 추가
		graph.get(4).add(3);graph.get(4).add(5);
		// 5번 노드에 연결된 노드 정보 - 5번에 3,4 추가
		graph.get(5).add(3);graph.get(5).add(4);
		// 6번 노드에 연결된 노드 정보 - 6번에 7 추가
		graph.get(6).add(7);
		// 7번 노드에 연결된 노드 정보 - 7번에 2,6,8 추가
		graph.get(7).add(2);graph.get(7).add(6);graph.get(7).add(8);
		// 8번 노드에 연결된 노드 정보 - 8번에 1,7 추가
		graph.get(8).add(1);graph.get(8).add(7);
		
		dfs(1);
		System.out.println();
		for(boolean flag : visited ) { // 박싱과 언박싱의 문법 Integer 이지만 int로 받아도된다.
			System.out.print(flag + "\t"); // 1부터 거쳐간 노드 확인
		}

	}
	
	public static void dfs(int start) {
		System.out.print(start + "\t");
		visited[start] = true;
		
		for(int node : graph.get(start)) { // 박싱과 언박싱의 문법 Integer 이지만 int로 받아도된다.
			if (!visited[node]) {
				dfs(node);
			}
		}
	}

}
