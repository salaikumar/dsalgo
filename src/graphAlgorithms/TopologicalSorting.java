/*
 * Topological Sorting.
 * Topological Sorting is redraw of the graph with all edges pointing upward.
 * 1. Works only in DAG - Directed Acyclic Graph
 * 2. DFS is used along with a stack
 */
package graphAlgorithms;

import java.util.Stack;

public class TopologicalSorting {

	/*
	 * Properties
	 */
	int[] edgeTo;
	boolean[] isVisited;
	Stack<Integer> reverseOrder;

	public TopologicalSorting(Digraph G) {
		// Create the Stack
		reverseOrder = new Stack<Integer>();
		// Initialize the arrays
		for (int i = 0; i < G.V(); i++) {

			isVisited[i] = false;
			edgeTo[i] = 0;
		}

	//	dfs(G);
	}

	private void dfs(Digraph g) {
		for (int i = 0; i < g.V(); i++) {
			if (!isVisited[i]) {
				originalDFS(g, i);
			}
		}
	}

	private void originalDFS(Digraph g, int i) {
		isVisited[i] = true;
		for (int w : g.adj(i)) {
			if (!isVisited[w])
				originalDFS(g, w);
		}
		// Put it into Stack;
		reverseOrder.add(i);
	}
	
	protected void revOriginalDFS(Digraph g, int i){
		
		isVisited[i] = true;
		for (int w : g.revAdj(i)) {
			if (!isVisited[w])
				revOriginalDFS(g, w);
		}
		// Put it into Stack;
		reverseOrder.add(i);
	}

	/*
	 * The final result set.
	 */
	public Iterable<Integer> reverseOrder() {
		return reverseOrder;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Unit testing Code goes here
	}

}
