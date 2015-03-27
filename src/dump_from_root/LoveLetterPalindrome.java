/*
* Love Letter Mystery problem.
* Simple terms -- Converting a string into a palindrome.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math;	
public class LoveLetterPalindrome{
		
	public static void main(String[] args){
		// N - Number of Strings : L- Length of the given string
		// R - Total number of reductions required to convert the String into a palindrome
		int N, L ,R =0;
		
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();		
		Scanner inputValue = new Scanner(input);
		N = inputValue.nextInt();
		//char a,b;
		
		// Read all the input lines and perform the action
		while(N-- > 0){
		
			input = new String(in.nextLine());
			L = input.length();
			R =0;
			// Calculate R
			for(int i =0; i< L/2; i++){
			
			//	a = input.charAt(i);
			//	b = input.charAt(L-1-i);
				R += Math.abs((int)input.charAt(i) - (int)input.charAt(L-1-i));				
				
			}
			
			System.out.println(R);
			

		}

		
				
	}

		

}
