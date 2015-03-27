/**
 * A Simple Implementation of Quick Sort 
 * with enhancements
 */
package SimpleSorting;

/**
 * @author Salaikumar
 *
 */
class QuickSort{
	
	@SuppressWarnings("unchecked")
	public boolean less( @SuppressWarnings("rawtypes") Comparable a, @SuppressWarnings("rawtypes") Comparable b){
		
		return ( a.compareTo(b) < 0 );
	}
	
	public int partition(Comparable[] a , int lo, int hi){
		Comparable temp;
		int i,j;
		i=lo;
		j=hi+1;
		
		// Partition. 
		while (true){
			
			while( less ( a[++i] ,a[lo])){
				if (i == hi) break;
			}
			
			while( less ( a[lo] ,a[--j])){
				if (j == lo) break;
			}
			
			if ( j <= i ) break;
			
			// Exchange
			temp = a[i];
			a[i]= a[j];
			a[j]= temp;
			
		}
		// Exchange
		temp = a[j];
		a[j]= a[lo];
		a[lo]= temp;
					
		
		return j;
	}
	
	public void sort(Comparable[] a){
		
		// Shuffle Code comes here. 
		
		sort( a ,0, a.length-1 );
	}
	
	
	public void sort(Comparable[] a , int lo , int hi){
		
		if(hi<=lo) return;
		
		int j = partition( a, lo, hi);
		
		sort( a, lo , j-1);
		
		sort ( a ,j+1 , hi);
	}
	
}


public class QuickSortApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// Input array
		Integer[] a = new Integer[20];
		
		a[0] = 56;
		a[1] = 34;
		a[2] = 64;
		a[3] = 87;
		a[4] = 23;
		a[5] = 67;
		a[7] = 11;
		a[8] = 14;
		
		QuickSort q = new QuickSort();
		
		System.out.println(" Before Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		q.sort(a);
		System.out.println(" After Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
