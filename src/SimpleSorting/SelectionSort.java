package SimpleSorting;

/*
 *  Implements the SelectionSort Technique. 
 *  It can sort any data type since it used the Comparable Interface 
 *  and CompareTo method. 
 *  In simple, uses CallBack
 */
	
public class SelectionSort {
	
	/*
	 * inputLength
	 */
	int inputLength;
	
	public void sort(Comparable a[]){
		
		int min;
		inputLength = a.length;
		
		for ( int i = 0; i < inputLength; i++ ) {
			
			min = i;	
			for ( int j = i+1; j <inputLength ; j++ ){
				
				if( lessThan( a[j], a[i])) {
					exchange(a, j, i);
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
