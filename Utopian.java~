/*
* Utopian Tree Challenge
* Monsoon = Height = 2*Height
* Summer = Height = Height+1
*/ 

import java.io.*;
import java.util.*;

public class Utopian{


	/*
	*  Utophian Tree Height Calculation
	*/
	public static void calculateHeight(int cycles){
		
		double height = 1.0;

		//Calculate it in a brute force approach and then we will optimize it
		for(int i=0;i<cycles; i++){

			if (i % 2 == 0){
			
				height = 2 * height;						
				
			} 			
			else{
				height += 1;
			}

		}

		System.out.println(height);		
		
	}




	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int totalTestCases;
		totalTestCases = in.nextInt();
		
		int[] values = new int[totalTestCases];

		// Get the input values for the problem.		
		for(int i=0; i<totalTestCases; i++){
		
			values[i] = in.nextInt();

		}
		
		// For Each input value calculate the Utopian Tree Height.
		for(int i=0; i<totalTestCases; i++){

			calculateHeight(values[i]);			
		}

	}

}
