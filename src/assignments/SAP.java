/*
 * Helper Class for WordNet.Java
 */
package assignments;

import edu.princeton.cs.algs4.BreadthFirstDirectedPaths;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SAP {

	// Given Graph
	private Digraph G;
	private ST<Integer, Integer> ancestors;
	private boolean[] marked; // marked[v] = is there an s->v path?

	private BreadthFirstDirectedPaths bfsV;
	private BreadthFirstDirectedPaths bfsW;

	// constructor takes a digraph (not necessarily a DAG)
	public SAP(Digraph G) {
		this.G = G;
		marked = new boolean[G.V()];
		ancestors = new ST<Integer, Integer>();
	}

	// length of shortest ancestral path between v and w; -1 if no such path
	public int length(int v, int w) {

		if ((v < 0 || v > G.V() - 1) || (w < 0 || w > G.V() - 1))
			throw new java.lang.IndexOutOfBoundsException(
					"Given Vertices are not in the Graph");

		int ancestor = ancestor(v, w);

		if (ancestor == -1)
			return -1;

		return bfsV.distTo(ancestor) + bfsW.distTo(ancestor);
	}

	/*
	 * a common ancestor of v and w that participates in a shortest ancestral
	 * path; -1 if no such path How to find the Ancestor? Run BFS from both the
	 * given node
	 */
	public int ancestor(int v, int w) {

		/*
		 * System.out.println("Inputs to Ancestor :" + v);
		 * System.out.println("Inputs to Ancestor :" + w);
		 */

		if ((v < 0 || v > G.V() - 1) || (w < 0 || w > G.V() - 1))
			throw new java.lang.IndexOutOfBoundsException(
					"Given Vertices are not in the Graph");

		bfsV = new BreadthFirstDirectedPaths(G, v);
		bfsW = new BreadthFirstDirectedPaths(G, w);

		// System.out.println("BFS Calculation done");
		/*
		 * Implementation using BFS
		 */

		if (bfsV.hasPathTo(w)) {
			ancestors.put(bfsV.distTo(w), w);

		}
		if (bfsW.hasPathTo(v)) {
			ancestors.put(bfsW.distTo(v), v);

		}

		Queue<Integer> q = new Queue<Integer>();

		marked[v] = true;
		q.enqueue(v);
		while (!q.isEmpty()) {
			int x1 = q.dequeue();
			for (int x2 : G.adj(x1)) {
				if (!marked[x2]) {
					if (bfsW.hasPathTo(x2))
						ancestors.put(bfsV.distTo(x2) + bfsW.distTo(x2), x2);
					marked[x2] = true;
					q.enqueue(x2);
				}
			}
		}

		if (ancestors.isEmpty())
			return -1;
		return ancestors.get(ancestors.min());

	}

	// length of shortest ancestral path between any vertex in v and any vertex
	// in w; -1 if no such path
	public int length(Iterable<Integer> v, Iterable<Integer> w) {

		for (int i : v) {
			if ((i < 0 || i > G.V() - 1))
				throw new java.lang.IndexOutOfBoundsException(
						"Given Vertices are not in the Graph");
		}

		for (int i : w) {
			if ((i < 0 || i > G.V() - 1))
				throw new java.lang.IndexOutOfBoundsException(
						"Given Vertices are not in the Graph");
		}
		int ancestor = ancestor(v, w);
		if (ancestor == -1)
			return -1;

		return bfsV.distTo(ancestor) + bfsW.distTo(ancestor);
	}

	// a common ancestor that participates in shortest ancestral path; -1 if no
	// such path
	public int ancestor(Iterable<Integer> v, Iterable<Integer> w) {

		/*
		 * System.out.println("Inputs to Ancestor :" + v);
		 * System.out.println("Inputs to Ancestor :" + w);
		 */
		for (int i : v) {
			if ((i < 0 || i > G.V() - 1))
				throw new java.lang.IndexOutOfBoundsException(
						"Given Vertices are not in the Graph");
		}

		for (int i : w) {
			if ((i < 0 || i > G.V() - 1))
				throw new java.lang.IndexOutOfBoundsException(
						"Given Vertices are not in the Graph");
		}

		for (int x : v) {
			for (int y : w) {
				ancestor(x, y);
			}

		}
		if (ancestors.isEmpty())
			return -1;

		return ancestors.get(ancestors.min());

	}

	/*
	 * Test Function to be deleted Need to print the complete symbolTable to see
	 * what is happening
	 */
	/*
	 * public void printST(){
	 * 
	 * for (int s : ancestors.keys()) {
	 * 
	 * System.out.println("-----------------"); System.out.println("Distance : "
	 * + s); System.out.println("Vertex : " + ancestors.get(s));
	 * System.out.println("-----------------"); } }
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		In in = new In(args[0]);
		Digraph G = new Digraph(in);
		SAP sap = new SAP(G);
		while (!StdIn.isEmpty()) {
			int v = StdIn.readInt();
			int w = StdIn.readInt();
			int length = sap.length(v, w);
			int ancestor = sap.ancestor(v, w);
			StdOut.printf("length = %d, ancestor = %d\n", length, ancestor);
		}
	}
}
