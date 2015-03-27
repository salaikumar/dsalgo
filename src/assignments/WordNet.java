/*
 * Assignment Problem -1 
 * Week 1. 
 * Refer to Coursera Website for more details. 
 */

package assignments;

import java.util.ArrayList;
import java.util.HashMap;

import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.DirectedCycle;
import edu.princeton.cs.introcs.In;

public class WordNet {
	private HashMap<String, ArrayList<Integer>> st; // String -> Integer
	// Conversion
	private String[] index; // Integer to String Conversion
	private Digraph D; // Directed Graph

	private SAP s;

	/*
	 * private class Vertex { Integer synsetId; String gloss; public
	 * Vertex(Integer synsetId, String gloss) { this.synsetId = synsetId;
	 * this.gloss = gloss; } }
	 */
	// constructor takes the name of the two input files
	public WordNet(String synsets, String hypernyms) {

		// System.out.println("Am reading input");

		// Read synsets file get all the vertices
		In input = new In(synsets);
		String[] fields;
		int i, counter = 0;
		st = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> values;
		while (input.hasNextLine()) {

			fields = input.readLine().split(",");

			// Make an entry in Symbol table
			i = Integer.parseInt(fields[0]);

			if (st.containsKey(fields[1])) {
				values = st.get(fields[1]);
				values.add(i);
				st.put(fields[1], values);
			} else {
				values = new ArrayList<Integer>();
				values.add(i);
				st.put(fields[1], values);
			}

			counter++;
		}

		// System.out.println("ST done: counter value :" + counter);

		// System.out.println("Index of C: "+ st.get("c"));
		index = new String[counter];
		for (String name : st.keySet()) {
			for (int a : st.get(name)) {
				index[a] = name;
			}
		}

		// System.out.println("Integer -> Array done");
		// Create a Digraph of corresponding Size and generate connections

		D = new Digraph(counter);
		input = new In(hypernyms);

		while (input.hasNextLine()) {
			fields = input.readLine().split(",");
			for (int j = 1; j < fields.length; j++)
				D.addEdge(Integer.parseInt(fields[0]),
						Integer.parseInt(fields[j]));
		}

		// System.out.println("Graph done");

		// Checks for rooted DAG.
		DirectedCycle d = new DirectedCycle(D);
		if (d.hasCycle())
			throw new java.lang.IllegalArgumentException("Graph has a Cycle");

		// Do SAP
		s = new SAP(D);
	}

	// the set of nouns (no duplicates), returned as an Iterable
	public Iterable<String> nouns() {
		return st.keySet();
	}

	// is the word a WordNet noun?
	public boolean isNoun(String word) {
		return st.containsKey(word);
	}

	// distance between nounA and nounB (defined below)
	public int distance(String nounA, String nounB) {

		if ((!st.containsKey(nounA)) || (!st.containsKey(nounB)))
			throw new java.lang.IllegalArgumentException(
					"Nouns are not present in the WordNet");

		// Get the values corresponding to the key
		Iterable<Integer> v = st.get(nounA);
		Iterable<Integer> w = st.get(nounB);
		// s.printST();
		return s.length(v, w);
	}

	// a synset (second field of synsets.txt) that is the common ancestor of
	// nounA and nounB
	// in a shortest ancestral path (defined below)
	public String sap(String nounA, String nounB) {

		if ((!st.containsKey(nounA)) || (!st.containsKey(nounB)))
			throw new java.lang.IllegalArgumentException(
					"Nouns are not present in the WordNet");

		int ancestorId = -1;

		// Create a SAP Instance

		// Get the ids of nounA and nounB and call the ancestor calculation
		ancestorId = s.ancestor(st.get(nounA), st.get(nounB));

		// System.out.println(" Returned Id : " + ancestorId);
		// s.printST();
		return index[ancestorId];
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {

	/*	WordNet w = new WordNet(
				"E:\\Aspire Labs\\Eclipse Workspace\\wordnet-testing\\wordnet\\synsets.txt",
				"E:\\Aspire Labs\\Eclipse Workspace\\wordnet-testing\\wordnet\\hypernyms.txt");

		// Checking if valid noun is working
		// Must return true
		System.out.println("Is Valid Noun :" + w.isNoun("1530s"));

		System.out.println("SAP of two strings: "
				+ w.sap("American_water_spaniel", "histology"));

		System.out.println("Distance of two strings: "
				+ w.distance("American_water_spaniel", "histology"));

*/	}

}
