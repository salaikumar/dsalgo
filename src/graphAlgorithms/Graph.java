/*
 *  Graph - Implemented using Adjacency list 
 *  Bags are used to hold the vertices and its connections in adjacency list
 */
package graphAlgorithms;

import dataStructures.Bag;

public class Graph {

	// No.of vertices
	int V,E;

	/*
	 * Bag to hold vertices and its connections. Its like each vertices is put
	 * in a bag and it contains one more bag to hold the connected vertices Bag
	 * DS is implemented under dataStructures Package in this project
	 */
	Bag<Integer>[] adj;
	
	/*
	 * Creates a graph with V vertices
	 */
	public Graph(int V) {

		
		this.V = V;
		E=0;
		// Create the req. number of bags.
		adj = (Bag<Integer>[]) new Bag[V];

		for (int i = 0; i < V; i++) {

			adj[i] = new Bag<Integer>();
		}
	}
	
	/*
	 *  adds an Edge between V and W.
	 */
	public void addEdge(int v, int w) {

		/*
		 * Undirected, should add at both vertices
		 */
		adj[v].add(w);
		adj[w].add(v);
		
		E++;
	}
	
	/*
	 *  Gives the set of vertices adjacent to a vertex V
	 */
	public Iterable<Integer> adj(int v){
		return adj[v];	
	}
	
	/*
	 *  Gives the number of Vertices
	 */
	public int V(){
		
		return V;
	}
	
	/*
	 *  Gives the number of Edges
	 */
	public int E(){
		return E;
	}
		
	
}