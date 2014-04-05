/*
 *  Breadth first Search
 *   Gives the shortest path between two vertices
 */
package graphAlgorithms;

import java.util.Queue;

public class BreadthFirstSearch {

	/*
	 * Properties Declaration Auxiliary Arrays that support Operations and gives
	 * data
	 */
	int[] edgeTo;
	boolean[] isVisited;
	int s;
	Queue<Integer> q;

	public BreadthFirstSearch(Graph g, int s) {
		// s - the vertex under process
		this.s = s;

		// Initialize the arrays
		for (int i = 0; i < g.V(); i++) {

			isVisited[i] = false;
			edgeTo[i] = 0;

		}

		bfs(g, s);

	}

	private void bfs(Graph g, int s2) {

		// Enqueue
		q.add(s2);

		// Mark it as visited
		isVisited[s2] = true;

		// Process still Queue is not empty
		while (!q.isEmpty()) {

			// Get a vertex from Queue
			int currentVertex = q.poll();
			// Process it
			for (int w : g.adj(currentVertex)) {

				if (!isVisited[w]) {

					q.add(w);
					isVisited[w] = true;
					edgeTo[w] = currentVertex;
				}

			}
		}

	}

}
