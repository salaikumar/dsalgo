package SimpleSorting;

/*
 *  Implements the InsertionSort Technique. 
 *  It can sort any data type since it used the Comparable Interface 
 *  and CompareTo method. 
 *  In simple, uses CallBack
 */
	
public class InsertionSort {
	
	/*
	 * inputLength
	 */
	int inputLength;
	
	public void sort(Comparable a[]){
		
		int min;
		inputLength = a.length;
		
		for ( int i = 0; i < inputLength; i++ ) {
			
			min = i;	
			/*
			 * Compare two elements
			 */
			for ( int j = i; j > 0 ; j-- ){
				
				if( lessThan( a[j], a[i])) {
					/*
					 * Move it till it reaches an approx.position
					 */
					exchange(a, j, i);
				}
				else
				{
					break;
				}
						
			}
		}
		
		
	}
	
	public void exchange(Comparable a[], int x, int y){
		
		Comparable swap = a[x];
		a[x] = a[y];
		a[y] = swap;
		
	}

	public boolean lessThan(Comparable a , Comparable b){
		
		return ( a.compareTo(b) < 0);
		
	}
	
	
}
