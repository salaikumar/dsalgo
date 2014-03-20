package SimpleSorting;
/*
 *  Applications of Sorting
 *  Shuffling : Given an array, we need to sort it.
 */

import java.util.Arrays;
import java.util.Random;

public class Shuffling {

	public  void shuffle(Comparable a[]){
		
		int inputLength = a.length;
		
		for ( int i =0 ; i <inputLength; i++){
			
			int randomNumber = StdRandom.uniform(i+1);
			exchange(a, i, randomNumber);
		}
	}
	
	public void exchange(Comparable a[], int x, int y) {

		Comparable swap = a[x];
		a[x] = a[y];
		a[y] = swap;

	}

}
