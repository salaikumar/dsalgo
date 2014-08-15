package assignments;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class Outcast {

	private WordNet w;

	// constructor takes a WordNet object
	public Outcast(WordNet wordnet) {
		w = wordnet;
	}

	// given an array of WordNet nouns, return an outcast
	public String outcast(String[] nouns) {

		ST<Integer, String> st = new ST<Integer, String>();
		// Check if each noun is a part of Wordnet
		int distance = 0;
		for (String n : nouns) {
			if (!w.isNoun(n))
				throw new java.lang.IllegalArgumentException(
						"Noun not a part of Wordnet");

			for (String n1 : nouns) {
				distance += w.distance(n, n1);
			}
			st.put(distance, n);
		}

		return st.get(st.min());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WordNet wordnet = new WordNet(args[0], args[1]);
		Outcast outcast = new Outcast(wordnet);
		for (int t = 2; t < args.length; t++) {
			In in = new In(args[t]);
			String[] nouns = in.readAllStrings();
			StdOut.println(args[t] + ": " + outcast.outcast(nouns));
		}

	}

}
