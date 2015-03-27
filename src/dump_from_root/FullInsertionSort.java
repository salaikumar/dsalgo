/*
* Insertion Sort Full Implementation
* Sorting an fully unsorted array using Insertion Sort Technique.
* Prints the array everytime an element is inserted into its correct position.
*/ 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FullInsertionSort{



	public static void fullInsertionSort(int[] ar){
	
		int a,j;
		
		for(int i=1; i < ar.length; i++){
			a= ar[i];
			j= i-1;
			while( j>=0){
				
				if( ar[j] > a ) {
					ar[j+1] = ar[j];
					j--;
				}				
				else{
					break;
				}							
			}
			
			ar[j+1] = a;
			printArray(ar);			
		}		
						
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		// Total Number of Elements in the array
		int s = in.nextInt();
		// Get the Array elements
		int[] arr = new int[s];
		
		// Get the array elements.
		for(int i=0; i < s; i++){
			arr[i] = in.nextInt();
		}			
		
		fullInsertionSort(arr);

	}

	private static void printArray(int[] ar){		
		// Print each element in the array
		for(int n : ar){
			System.out.print(n+" ");
		}
		System.out.println("");
	}	


}
