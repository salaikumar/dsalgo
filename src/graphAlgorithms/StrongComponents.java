/*
 *  Strong Components
 *  A set of Strongly connected components
 *  Algorithm
 *  1. Take the reverse graph
 *  2. Topologically sort it
 *  3. Run reverse dfs on the topological sort reverse order. 
 *  4. Just create Strong components during the last DFS
 */
package graphAlgorithms;

class DepthFirstOrder extends TopologicalSorting {

	public DepthFirstOrder(Digraph G) {
		super(G);
		G.reverse();
		dfs(G);

	}

	/*
	 * Just override the Method to work on the revOriginal
	 */
	private void dfs(Digraph g) {
		for (int i = 0; i < g.V(); i++) {
			if (!isVisited[i]) {
				revOriginalDFS(g, i);
			}
		}
	}

}

public class StrongComponents {

	/*
	 * Properties
	 */
	int V; // Vertices
	boolean[] isVisited; // Visit Status of Graph Vertices
	int[] vertexComponent; // The component under which the vertex resides
	int componentCount; // Count of ConnectedComponents in G.

	public StrongComponents(Digraph G) {

		V = G.V();
		isVisited = new boolean[V];
		vertexComponent = new int[V];
		componentCount = 0;

		DepthFirstOrder dfs = new DepthFirstOrder(G);

		// Get the reverse Order
		for (int w : dfs.reverseOrder()) {
			// if it is not visited
			if (!isVisited[w]) {
				originalDFS(G, w);
				vertexComponent[w] = componentCount;
				componentCount++;
			}
		}

	}

	private void originalDFS(Digraph g, int v) {
		isVisited[v] = true;
		for (int w : g.adj(v)) {
			if (!isVisited[w]) {
				originalDFS(g, w);
			}
		}
	}

	/*
	 * Total number of connected components
	 */
	public int total() {
		return componentCount;
	}

	/*
	 * Checks if two vertices are connected
	 */
	public boolean isConnected(int v, int w) {

		return (vertexComponent[v] == vertexComponent[w]);
	}

	/*
	 * returns the Component where the vertex resides
	 */
	public int componentOf(int v) {
		return vertexComponent[v];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
