package com.encore.data.structor.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

	private int data;
	private boolean visited; //boolean 의 default 는 false
	private List<GraphNode> corLst;
	
	public GraphNode() {
	}
	
	public GraphNode(int data) { // node에 데이터를 넣는다. 연결되는 노드들을 corLst List 형태로 연결
		this.data = data;
		this.visited = false;
		corLst = new ArrayList<GraphNode>();
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<GraphNode> getCorLst() {
		return corLst;
	}

	public void setCorLst(List<GraphNode> corLst) {
		this.corLst = corLst;
	}
	
	
}
