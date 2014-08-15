/*
* Partitioning an Array with respect to an element
* Core of Quick Sort
* The Code shifts all the elements in less than p to its left and greater than p to its right
* No need to do it inplace
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSortPartition{

	// Full Quick Sort Implementation Methods
	public static int[] fullPartition(int[] ar , int length){
	
		// Partition & Sort Code
		if(ar.length > 1){
	 
			// Two Auxillary Subarrays
			// Being pessimistic, all the elements can be low than given element
			int[] leftArray = new int[length];			
			int[] rightArray = new int[length];

			int p = ar[0];

			int j=0,k=0;
			// Split the array;		
			for(int i=1; i< ar.length; i++){
				// Move the elements with respect to pivot			
				if(ar[i] < p && j<leftArray.length){
				  leftArray[j] = ar[i];
				  j++;
				}
				else if ( ar[i] >= p && k < rightArray.length){ 
				  rightArray[k] = ar[i];
				  k++;
				}
			}	
			return mergeArray(fullPartition(leftArray,j), fullPartition(rightArray,k) , p,j,k);
		}
		else{
			return ar;
		}
		
			
	}
	
	public static int[] mergeArray(int[] leftArray, int[] rightArray,int p, int x, int y){

		// Create a new array;
		int[] ar = new int[x+y+1];				
		int i = 0;

		//if( x > 0){ 
			for(int j=0; j<x;j++){
				ar[i] = leftArray[j];
				i++;						
			}
		//}
		// Merge the pivot
		ar[i++] = p;
		//if (y > 0){
			for (int k=0; k<y;k++){
				ar[i] = rightArray[k];
				i++;
			}
		//}
		printArray(ar);
		return ar;			
	}

	public static void partitionArray(int[] ar){
		
		// Partition & Sort Code

		// Two Auxillary Subarrays
		// Being pessimistic, all the elements can be low than given element
		int[] leftArray = new int[ar.length];			
		int[] rightArray = new int[ar.length];

		int p = ar[0];

		int j=0,k=0;
		// Split the array;		
		for(int i=1; i< ar.length; i++){
			
			if(ar[i] < p){
			  leftArray[j]= ar[i];
			  j++;
			}
			else if ( ar[i] >= p){ 
			  rightArray[k] = ar[i];
			  k++;
			}
		}

		// Merge Code
		// Add the p to the left subarray
		leftArray[j++] = p;

		// Now, Merge the sorted arrays;
		int i=0;
		// Copy left subarray to original array
		for( int x=0; x<j; x++){
			ar[i] = leftArray[x];
			i++;
		}
		// Copy right subarray to original subarray
		for(int x=0; x<k; x++){
			ar[i] = rightArray[x];
			i++;		       
		}
		
		// Print the final array;
		printArray(ar);

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
		fullPartition(arr,s);
	
	}
	
	private static void printArray(int[] ar) {		
		// Print each element in the array
		for(int n : ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}
