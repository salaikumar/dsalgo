/*
* Calvin Vehicle Problem.
* In Short , Finding the smallest Element in an subarray problem. 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Calvin{

	// laneLength = Length of the lane 
	// testCases = total Number of TestCases
	static int laneLength, testCases;
	static int[] width;
	static int[] testCasesValues;
	public static void calculateSmallestValue(int i , int j){
		
		int smallestValue = width[i];  		
		for(int i1 = i; i1 <= j; i1++){
			if (smallestValue > width[i1])
				smallestValue  = width[i1];
		}
		System.out.println(smallestValue);				
	}


	public static void main(String[] args){

		// Read the Input from the Console
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		Scanner parseScanner = new Scanner(input);
		
		laneLength = parseScanner.nextInt();
		testCases = parseScanner.nextInt();

		 width = new int[laneLength];				
		 testCasesValues = new int[2*testCases];

		
		// Read the widths
		input = in.nextLine();		
		parseScanner = new Scanner(input);
		for(int i =0; i<laneLength; i++){
			width[i] = parseScanner.nextInt();
		}

		
		for(int i=0 ,  j=0 ;i<testCases; i++, j += 2){
			input = in.nextLine();
			parseScanner = new Scanner(input);
			testCasesValues[j] = parseScanner.nextInt();
			testCasesValues[j+1] = parseScanner.nextInt();
			
		}
	
		for(int i =0; i<testCasesValues.length; i +=2 ){
			calculateSmallestValue(testCasesValues[i] ,testCasesValues[i+1] );
		}
						
	}
}
