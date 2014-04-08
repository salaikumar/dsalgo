/*
 *  DFS - The Algorithm behind the photo shop color fill magic wand
 */
package graphAlgorithms;

public class DepthFirstSearch {

	/*
	 * Properties
	 */
	int[] edgeTo;
	boolean[] isVisited;
	int s;

	public DepthFirstSearch(Graph G, int s) {

		// s - the vertex under process
		this.s = s;

		// Initialize the arrays
		for (int i = 0; i < G.V(); i++) {
			isVisited[i] = false;
			edgeTo[i] = 0;

		}

		dfs(G, s);
	}

	private void dfs(Graph g, int s2) {

		// Mark the current vertex as visited
		isVisited[s2] = true;
		for (int w : g.adj(s2)) {
			if (!isVisited[w]) {
				// Recursive Call
				dfs(g, w);
				edgeTo[w] = s2;
			}

		}

	}

}
