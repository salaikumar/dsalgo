/*
* Implementation of Quick Sort Partition
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class QuickSort{
	
	
	// Sorting Algorithm
	private static void sort(int ar[], int start, int end){
	
		// We have pivot element as Starting element/First element.
		int pivotPosition = partition(ar,start,end);
		
		// Recursive calls for SubArray;
		sort(ar,start,pivotPosition-1);
		sort(ar,pivotPosition+1,end);

	}


	// Partitioning Algorithm
	private static int partition(int ar[],int start, int end){
		
		// Pick the pivot element
		int pivotElement = ar[start];
		
		//Exchange elements
		for()

	}















	public static void main(String[] args){
		/*
		* Input collection
		*/
		Scanner in = new Scanner(System.in);
		// Total Number of Elements in the array
		int s = in.nextInt();
		// Get the Array elements
		int[] arr = new int[s];
		
		// Get the array elements.
		for(int i=0; i < s; i++){
			arr[i] = in.nextInt();
		}	
		sort(arr,0,s);
	
	}
	
	private static void printArray(int[] ar) {		
		// Print each element in the array
		for(int n : ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}

}
