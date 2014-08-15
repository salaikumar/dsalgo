/*
 * Shell Sorting, in simple is an advancement in Insertion Sorting.
 * It uses g-sorting in the back and more efficient.
 * In simple Insertion sorting is 1-shell sorting.
 * 
 */
package SimpleSorting;

/**
 * @author Salaikumar
 * 
 */
public class ShellSorting {

	/*
	 * inputLength
	 */
	int inputLength;

	public void sort(Comparable a[]) {

		int min, h;
		h = 1;
		inputLength = a.length;

		/*
		 * To get the h value Knuth provided it as 3x+1 Code to generate 1, 4,
		 * 13,..
		 */
		while (h < inputLength / 3)
			h = 3 * h + 1;

		while (h >= 1) {

			for (int i = h; i < inputLength; i++) {

				min = i;
				/*
				 * Compare two elements
				 */
				for (int j = i; j >= h; j -= h) {

					if (lessThan(a[j], a[j - h])) {
						/*
						 * Move it till it reaches an approx.position
						 */
						exchange(a, j, j - h);
					} else {
						break;
					}

				}
			}

			h = h / 3;
		}

	}

	public void exchange(Comparable a[], int x, int y) {

		Comparable swap = a[x];
		a[x] = a[y];
		a[y] = swap;

	}

	public boolean lessThan(Comparable a, Comparable b) {

		return (a.compareTo(b) < 0);

	}

}
