package com.encore.data.structor.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GraphServiceImpl {

	public GraphServiceImpl() {
	}
	
	public GraphNode makeNode(int data){
		GraphNode node = new GraphNode(data);
		return node;
	}
	
	public void makeEdge(GraphNode idxNode, GraphNode corNode) {
		idxNode.getCorLst().add(corNode); // idxNode 객체에 ArrayList 호출헤서 corNode를 추가(간선 연결)
	}
	
	// 재귀호출이 필요하고
	// Iterator
	// 방문을 체크
	
	// 내가 한거.
//	public void dfs(GraphNode node) {
//		System.out.print(node.getData() + "\t");
//		node.setVisited(true); // 노드를 방문했음을 표시, true 값 세팅
//		for(GraphNode viNode : node.getCorLst()) { // 현재 노드의 모든 이웃에 대해
//			if (!viNode.isVisited()) { // 방문하지 않은 이웃에 대해서만
//				dfs(viNode); // 재귀적으로 DFS를 수행
//			}
//		}
//	}
	
	public void dfs(GraphNode node) {
		System.out.print(node.getData() + "\t");
		node.setVisited(true); 
		
		/* case01.
		List<GraphNode> lst = node.getCorLst();
		for(int idx = 0; idx < lst.size(); idx++) {
			GraphNode data = lst.get(idx);
			if ( !data.isvisited() ) {
				dfs(data);
			}
		}
		*/
		// case02.
		Iterator<GraphNode> iter = node.getCorLst().iterator();
		while( iter.hasNext()) {
			GraphNode data = iter.next();
			if(!data.isVisited()) {
				dfs(data);
			}
			
		}
	} // dfs
	
	public void bfs(int [][] ary, boolean [] visit) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// 데이터이면서 2차원 배열의 행의 인덱스
		queue.offer(1);
		visit[1] = true;
		
		while(!queue.isEmpty()) { // 큐가 비어있는지, 비었으면 true 아니면 false
			int row_data = queue.poll(); // 1이 행의 인덱스
			System.out.print(row_data + "\t");
			for(int idx = 0; idx < ary[row_data].length; idx++) { // 행 인덱스
				// 데이터이지만 인덱스로 사용
				int temp = ary[row_data][idx];
				if( !visit[temp] ) {
					visit[temp] = true;
					queue.offer(temp);
				}
			}
		}
	}
	
	// List로 변경
	public void bfs(GraphNode node) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		
		// 데이터이면서 2차원 배열의 행의 인덱스
		queue.offer(node);
		boolean [] visit = new boolean[9];
		visit[node.getData()] = true;
		
		while(!queue.isEmpty()) { // 큐가 비어있는지, 비었으면 true 아니면 false
			GraphNode g = queue.poll();
			System.out.print(g.getData() + "\t");
			for(int idx = 0; idx < g.getCorLst().size(); idx++) {
				// 데이터이지만 인덱스로 사용
				GraphNode data = g.getCorLst().get(idx);
				if( !visit[data.getData()] ) {
					visit[data.getData()] = true;
					queue.offer(data);
				}
			}
		}
	}
}
