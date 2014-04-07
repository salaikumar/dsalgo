/**
 * Connected Components - A Graph processing Algorithm
 * Helps to check if two points are connected in constant time
 * DFS is used in the background
 */
package graphAlgorithms;

/**
 * @author Salaikumar Saravanan
 * 
 */
public class ConnectedComponents {

	/*
	 * Properties
	 */
	int V; // Vertices
	Graph G; // Given Graph
	boolean[] isVisited; // Visit Status of Graph Vertices
	int[] edgeFrom; // The edge from the vertex was reached
	int[] vertexComponent; // The component under which the vertex resides
	int componentCount; // Count of ConnectedComponents in G.

	/*
	 * Constructor
	 */
	public ConnectedComponents(Graph G) {

		this.G = G;
		V = G.V();
		edgeFrom = new int[V];
		isVisited = new boolean[V];
		vertexComponent = new int[V];
		componentCount = 0;

		dfs(G);
	}

	/*
	 * Depth First Search
	 */
	private void dfs(Graph g2) {

		/*
		 * Loop at the isVisited Array
		 */
		for (int i = 0; i < V; i++) {
			// if it is not visited
			if (!isVisited[i]) {

				isVisited[i] = true;
				vertexComponent[i] = componentCount;
				for (int w : g2.adj(i)) {
					if (!isVisited[w]) {

						isVisited[w] = true;
						edgeFrom[w] = i;
						vertexComponent[w] = componentCount;
					}
				}
				componentCount++;
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
