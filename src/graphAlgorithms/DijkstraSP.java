/*
 * Implementation of Shortest path finding algorithm found by Dijkstra
 * Following Coursera's Lecture to understand API to just practice it
 */
package graphAlgorithms;

import edu.princeton.cs.algs4.DirectedEdge;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;
import edu.princeton.cs.algs4.IndexMinPQ;

public class DijkstraSP {

	/*
	 * Properties
	 */
	private DirectedEdge[] edgeTo;
	private double[] disTo;
	private IndexMinPQ<Double> pq;

	public DijkstraSP(EdgeWeightedDigraph G, int s) {

		edgeTo = new DirectedEdge[G.E()];
		disTo = new double[G.V()];
		pq = new IndexMinPQ<Double>(G.V());

		// Initialize the Distance To Methods
		for (int v = 0; v < G.V(); v++)
			disTo[v] = Double.POSITIVE_INFINITY; // Set unknown distances to
													// infinity

		disTo[s] = 0;

		// Add The Source to the priority Queue.
		pq.insert(s, 0.0);

		// Until the Queue is empty
		while (!pq.isEmpty()) {

			// Get all the Adjacent Vertices to it.
			int v = pq.delMin();
			for (DirectedEdge e : G.adj(v)) {
				relax(e);
			}

		}

	}

	private void relax(DirectedEdge e) {

		int v = e.from(), w = e.to();

		if (disTo[w] > disTo[v] + e.weight()) {

			// Update the distance
			disTo[w] = disTo[v] + e.weight();

			// Update the edgeTo
			edgeTo[w] = e;

			// Make Changes/Insertion in the PQ;
			if (pq.contains(w)) {
				pq.decreaseKey(w, disTo[w]);
			} else
				pq.insert(w, disTo[w]);

		}

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
