/*
* Gem Element finding problem
* In simple, finding the number of common elements in given set of arrays
* Comes under Union and Intersection of Sorted Arrays problem
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemElement{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);	
		// Get the input
		// Total number of rocks
		int N;		
		
		String input = in.nextLine();
		Scanner rocksCount = new Scanner(input);
		N = rocksCount.nextInt();
		
		// To Store the elementList of each rock
		String[] rockElements = new String[N];
		
		for(int i=0; i<N; i++){
			rockElements[i] = in.nextLine();
		}
			
		// To Store the common elements in array
		String commonElements;
		StringBuilder temp;
		char[] temp1 = new char[100];
		
		// Loop to sort in the given String. 
		// Without Sorting it will take n* given N times to solve the problem		
		for(int i = 0; i<N; i++){
			temp1 = rockElements[i].toCharArray();
			Arrays.sort(temp1);
			rockElements[i] =  new String(temp1);			
		}		
		
		//Code to Check the above value
		/*for(int i=0; i < N; i++){
			System.out.println(rockElements[i]);
		} */


		// Finding the Intersection of given arrays.
		// Assign The rockElements[0] to CommonElements
		commonElements = new String(rockElements[0]);

		// To be Deleted
		//System.out.println(commonElements);

		int i,j;
		// Do it for every pair
		for(int x=1; x<N; x++){

			temp = new StringBuilder();					
			i=0;j=0;
			while(i < commonElements.length() && j < rockElements[x].length()){
			//		System.out.println("Iteration "+ x);
					 if (commonElements.charAt(i) < rockElements[x].charAt(j)){
						i++; 
					 }
					 else if (commonElements.charAt(i) > rockElements[x].charAt(j)){
					 	j++;
					 }
					 else{
		//				System.out.print("Appendings"+" "+ commonElements.charAt(i));
						temp.append(commonElements.charAt(i));
						i++;j++;
					 }
			}
			
			// Assign the Common element present in temp to CommonElements String
			//System.out.println("String Builder Value - Temp " +temp);
			commonElements = new String(temp);
			//System.out.println("Common Elements Value " +commonElements);

		}
		
		// Number of Common Elements in given Arrays = commonElements.length	
		System.out.println(commonElements);
		System.out.println(commonElements.length());
	}		
}
