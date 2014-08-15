/*
* This problem takes an Array as input an segregates the zeros and non zero integers. 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Segregation{

	private static void segregate(int ar[]){
		int temp = 0,nonZero = 0, swap =0;;
		for(int i = 0; i< ar.length;i++){
			if( ar[i] == 0)
			{
				temp = ar[i];
				for(int j=i+1; j< ar.length;j++){
					if(ar[j] != 0){
						ar[i] = ar[j];
						ar[j] = temp;
						swap++;
						nonZero++;
						break;
					}
			
				}
			}
			else
				nonZero++;
		}

		System.out.println("Non Zero Integers:"+ nonZero);
		System.out.println("MinimumSwaps"+ swap);
		printArray(ar);		
				
	}
	
	private static void exchange(int ar[], int i, int j){
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	
	private static void printArray(int ar[]){
		for(int i: ar)
			System.out.print(i+ " ");
		System.out.println(" ");
	}



	public static void main(String[] args) {
		
		// Input collection.        
		Scanner in = new Scanner(System.in);
        	int s = in.nextInt();
        	int[] ar = new int[s];
        	for(int i=0;i<s;i++){
        	   ar[i]=in.nextInt(); 
        	}
		//Call Segregation
		segregate(ar);
	}
}
