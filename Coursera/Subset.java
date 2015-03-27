/*
* Subset.java
* Class created to test Deque and Randomized Queue
*/

import java.io.*;
import java.lang.*;

public class Subset{
	public static void main(String[] args){
		RandomizedQueue<String> rQ = new RandomizedQueue<String>();
		int count = Integer.parseInt(args[0]);
		while (!StdIn.isEmpty()) { // Enqueue all the inputs 
		   rQ.enqueue(StdIn.readString());
		}
		while (count > 0) { // 
		   StdOut.println(rQ.dequeue());
		   count--;
		}
		/*
		while (!StdIn.isEmpty()) { // add Inputs to Deque
		   deque.addFirst(StdIn.readString());
		}
		
		
		// Remove
		temp = count;
		while (temp > 0 ) { // 
		   StdOut.println(deque.removeLast());
		   temp--;
		}
		*/
							
	}
}
