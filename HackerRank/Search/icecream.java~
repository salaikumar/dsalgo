/*
* Ice Cream Parlor Problem
* Site : HackerRank
* Topic : Search
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class icecream{
	
	public static void main(String args[]){
		int testCases;
		int sum;
		int arraySize;
		int[] arr;
	
	// Read input.
	Scanner input = new Scanner(System.in);
	testCase = input.nextInt();

	while(testCase>0){
		sum = input.nextInt();
		arraySize = input.nextInt();
		arr = new int[arraySize];
		for(int i=0 ; i <arraySize;i++ ){
			arr[i] = input.nextInt();
		}
		
		// Find the pair
		findPair(arr,sum);
	}

	private static void findPair(int[] arr, int sum){
		int low=0, high = arr.length()-1;
		while( l < r){
			if(arr[low] + arr[high] == sum)
				System.out.println(l +" " h);
			else if (arr[low] + arr[high] < sum)
				low++;
			else
				high--;
				
		}				
	}
	
}
