/*
 * Digraph implementation. 
 * Underlying DS - Bags
 */
package graphAlgorithms;

import java.util.Iterator;

import dataStructures.Bag;

public class Digraph {

	/*
	 * Properties
	 */
	int V, E; // No. of Vertices
	Bag<Integer> adj[]; // Adjacent Vertices list
	int[] inDegree; // In degree
	int[] outDegree; // Out Degree

	public Digraph(int V) {
		this.V = V;

		// To hold all vertices
		adj = (Bag<Integer>[]) new Bag[V];

		// To hold the Adjacent Vertices
		for (int i = 0; i < V; i++) {
			adj[i] = (Bag<Integer>) new Bag();
		}

	}

	/*
	 * Add a new Edge
	 */
	public void addEdge(int v, int w) {

		// Add to the list
		adj[v].add(w);
		// Update the in degree
		inDegree[w]++;
		// Update the outdegree
		outDegree[v]++;
		// Update the number of Edges
		E++;
	}

	/*
	 * Returns the adjacency vertices list
	 */
	public Iterable<Integer> adj(int v) {

		return adj[v];
	}

	/*
	 * Returns the total number of vertices
	 */
	public int V() {
		return V;
	}

	/*
	 * Returns the outdegree
	 */
	public int outDegree(int v) {
		return outDegree(v);
	}

	/*
	 * Returns the inDegree
	 */
	public int inDegree(int v) {
		return inDegree(v);
	}

	/*
	 * Returns the total number of Edges
	 */
	public int E() {
		return E;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
