/*
* Maximum Sum Problem
* Given 2 sorted arrays with / without common elements,  Find the sum of the maximum sum path to reach from beginning of any array to end of any *of the two arrays. We can switch from one array to another array only at common elements.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximumSum{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		
		// Size of 2 arrays
		int m,n;

		// Get first array
		m = input.nextInt();
		int[] arr1 = new int[m];
		for(int i=0; i<m; i++){
			arr1[i]= input.nextInt();
		}

		// Get next array
		n = input.nextInt();
		int[] arr2 = new int[n];
		for(int i=0; i<n; i++){
			arr2[i]= input.nextInt();
		}
		
		// Call method to calculate sum
		calculateMaxSum(arr1,arr2);

	}

	private static void calculateMaxSum(int[] arr1, int arr2[]){
		
		int sum1 = 0, sum2 = 0, maxSum = 0 , i =0 , j =0;
		
		while(i < arr1.length && j < arr2.length){
			if( arr1[i]< arr2[j]){
				sum1 = sum1+ arr1[i];
				i++;
//				System.out.println("Sum1:"+sum1);
			}
			else if(arr1[i] > arr2[j]){
				sum2 = sum2 + arr2[j];
//				System.out.println("Sum2:"+sum2);
				j++;
			}	
			else{
				maxSum = maxSum + arr1[i];
				if( sum1 > sum2)
					maxSum += sum1;
				else if (sum1 < sum2)
					maxSum += sum2;
				else
				
					maxSum += sum1;
				sum1 = sum2 =0;
				i++; j++;
//				System.out.println("maxSum-inner:" + maxSum);
//				System.out.println("i:" + i);
//				System.out.println("j:" + j);
			}
						
		}
		
		if( i < arr1.length ){
			for( ; i<arr1.length; i++){
				sum1 = sum1+ arr1[i];
			}
			maxSum = maxSum + sum1;
//			System.out.println("maxSum:" + maxSum);
		}
		else if ( j < arr2.length ){
			for(; j< arr2.length; j++)
				sum2 = sum2 +arr2[j];
			maxSum = maxSum + sum2;
//			System.out.println("maxSum:" + maxSum);
		}
		

		System.out.println("maxSum:" + maxSum);

				
	}

}
