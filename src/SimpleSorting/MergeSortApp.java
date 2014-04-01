/**
 *  A Simple Implementation of merge sort
 */
package SimpleSorting;

/**
 * @author Salaikumar
 * 
 */

public class MergeSortApp {

	private static Comparable[] aux;

	/*
	 * The Abstract in place merge sort
	 */
	public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid,
			int hi) {

		// Assert that the sub arrays are sorted.
		assert isSorted(a, lo, mid);
		assert isSorted(a, mid + 1, hi);

		// Copy to Auxillary array.
		for (int i = 0; i < a.length; i++) {
			aux[i] = a[i];
		}

		/*
		 * The Following code is not optimized // Bug here = > J = 0; int i = 0,
		 * j = 0, k = 0; // Compare and merge while (i <= mid && j <= hi) {
		 * 
		 * if (lessThan(aux[i], aux[j])) { a[k++] = aux[i++]; } else if
		 * (lessThan(aux[j], aux[i])) { a[k++] = aux[j++]; } else { a[k++] =
		 * aux[i++]; }
		 * 
		 * }
		 * 
		 * // Moving the remaining elements if (i <= mid) {
		 * 
		 * for (; i <= mid; i++) {
		 * 
		 * a[k++] = aux[i]; } } else if (j <= hi) {
		 * 
		 * for (; j <= hi; j++) {
		 * 
		 * a[k++] = aux[j]; } }
		 */

		/*
		 * The Optimized Code for doing it. Neat and Clear
		 */

		int i = lo, j = mid + 1;
		for (int k = 0; k < a.length; k++) {

			/*
			 * If first half ends, move the elements of second half
			 */
			if (i > mid)
				a[k++] = aux[j++];
			else if (j > hi)
				a[k++] = aux[i++];
			else if (lessThan(aux[j], aux[i]))
				a[k++] = a[j++];
			else
				a[k++] = aux[i++];
			
			
			/*
			 *  Use of this code removes the need of Copy Step
			 * if (i > mid)
				aux[k++] = a[j++];
			else if (j > hi)
				aux[k++] = a[i++];
			else if (lessThan(a[j], a[i]))
				aux[k++] = a[j++];
			else
				aux[k++] = a[i++];
			*/

		}

		assert isSorted(a, lo, hi);
	}

	private static boolean isSorted(Comparable[] a, int lo, int hi) {

		/*
		 * Checks if an array is sorted.
		 */

		return true;
	}

	
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {

		if (hi <= lo)
			return;
		// Use Insertion Sort for smaller numbers
		
		// See how the mid is calculated
		// Its not lo + hi /2
		int mid = (lo + (hi - lo)) / 2;

		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		
		/*
		 *  Using this avoids the Copy Step in Merge Sort
		 * 	sort(aux, a, lo, mid);
		 *	sort(aux,a , mid + 1, hi);
		 *  merge(aux, a, lo, mid, hi);
		 */
		
		// Check the subarrays are partially sorted.
		// 1 2 3 | 4 5 6
		if( lessThan(a[mid], a[mid+1]))
			return;
		
		merge(a, aux, lo, mid, hi);

	}

	private static void sort(Comparable[] a) {

		aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}

	private static boolean lessThan(Comparable comparable,
			Comparable comparable2) {

		return (comparable.compareTo(comparable2) < 0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
