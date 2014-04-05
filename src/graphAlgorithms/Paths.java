/*
 *  Implementing all the Graph processings as seperate classes
 *  It helps since the Graph can be processed in many ways.
 */
package graphAlgorithms;

public class Paths {
	
	/*
	 * Properties Declaration goes here 
	 */
	Graph G;
	int currentVertex;
	Iterable<Integer> adj;

	/*
	 *  G - Input Graph to be processed
	 *  s - the vertex under focus.
	 */
	public Paths(Graph G, int s){
		
		this.G = G;
		currentVertex = s;
		
		// Since we are going to use adj[s] many times, let get it and keep it.
		adj = G.adj(s);
	}
	
	/*
	 * returns true if there is a path in Graph G b/w the given vertices
	 */
	public boolean hasPathTo(int w){
		
		boolean result = false;
		for ( int x : adj) {
			if( x == w){
				result = true;
				break;
			}
		} 
		return result; 
	}
	
	/*
	 * returns the List of Paths(if any) from s to given vertex
	 */
	Iterable<Integer> pathTo(int v){
		
		// Code goes here.
		// Kindly wait till the current song finishes...
		return null;
	}

}
