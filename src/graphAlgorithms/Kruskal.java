/*
 * Kruskal's Method of Finding Minimum Spanning tree
 */

package graphAlgorithms;

import edu.princeton.cs.algs4.*;

public class Kruskal {

	/*
	 * Minimum Spanning Tree
	 */
	private Queue<Edge> mst = new Queue<Edge>();

	/*
	 * @param G - An Edge Weighted Graph
	 */
	public Kruskal(EdgeWeightedGraph G) {

		/*
		 * A Temporary Priority Queue
		 */
		MinPQ<Edge> pq = new MinPQ<Edge>();

		// Add all the edges to the priority Queue
		for (Edge e : G.edges()) {
			pq.insert(e);
		}

		// Make a Union-Find
		UF uf = new UF(G.V());

		// Forming Minimum Spanning Tree
		while ((!pq.isEmpty()) && (!(mst.size() < G.V() - 1))) {

			Edge e = pq.delMin();

			// Get the vertices from the edges
			int v = e.either(), w = e.other(v);

			// Check if it forms a cycle
			if (!uf.connected(v, w)) {

				// Connect them.
				uf.union(v, w);

				// Add it to the spanning tree
				mst.enqueue(e);
			}
		}

	}

	/*
	 * Returns the minimum spanning tree
	 */
	public Iterable<Edge> edges() {
		return mst;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
