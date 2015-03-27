/*
* Randomized Queue Implementation
* It uses Array Resizing array concept 
* Every random element removed the Queue creates a empty place. 
* It is managed by moving the last element to the corresponding position
*/

import java.io.*;
import java.lang.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomizedQueue<Item> implements Iterable<Item> {
	
	/*
	* Properties Declaration.
	* Make sure they are declared private.
	*/
	private Item item[];   // The Array to hold the elements
	private int size ;     //  Number of elements present in the Queue
	private int queueEnd;  // Point to  the end of queue. 	
	
	/*
	* Constructor.
	*/
	public RandomizedQueue() {
		item = (Item[]) new Object[1];
	}
	
	/*
	* isEmpty
	*/
	public boolean isEmpty() {
		return (size == 0);
	}
	
	/*
	* size - Size of the Queue 
	*/
	public int size(){
		return size;
	}
	
	/*
	* Enqueue
	*/
	public void enqueue (Item oneItem) {
		if ( oneItem == null)
       		     throw new NullPointerException("Queue doesn't accept NULL items");
		if ( isFull())
		    resizeArray(item.length *2 );	
		item[queueEnd++] = oneItem;	
		size++;
	}
	
	/*
	* Deque
	*/
 	public Item dequeue () {
 		if (isEmpty())
        	    throw new NoSuchElementException(" Queue is Empty");

		Item randomElement;
		int randomIndex = randInt(0,queueEnd-1);
		//System.out.println("Random Number:"+ randomIndex);
		randomElement = item[randomIndex];
	   	item[randomIndex] = item[--queueEnd];
		item[queueEnd]  = null;
		size--;
		
		if ( size > 1 && (size == ( item.length/4)) )
		    resizeArray(item.length / 2);
		    
		return randomElement;
			
	}
 	
 	/*
 	*  Sample 
 	*/
 	public Item sample(){
 		if (isEmpty())
		        throw new NoSuchElementException(" Queue is Empty");
		Item randomElement;
		int randomIndex = randInt(0,queueEnd-1);
		randomElement = item[randomIndex];
		return randomElement;
 	}
	
	/*
	    * resizeArray -- Resize and rearrange the original Array to the given array1
        */
    	private void resizeArray (int length){
		Item[] tempArray = (Item[]) new Object[length];
		for (int i = 0 ; i < queueEnd; i++){
		    tempArray[i] =  item[i];
		}
		
		//  Assign the new resized array to original array
		item = tempArray;
		
    	}

    	/*
    	* isFull -- Checks if the Queue is full
     	*/
    	private boolean isFull() {
        	return size == item.length;
    	}
 	
	/* randInt  Method to generate Random Number.
         * @return int - Random number within in the given range.
         */
        private int randInt(int low, int high){
		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((high - low) + 1) + low;
		return randomNum;
        }
	
	/*
 	* iterator
 	*/
 	public Iterator<Item> iterator(){
 		return new QueueIterator<Item>(size);
 	}
 	
 	/*
 	* Iterator Class
 	* You are implementing an Iterator. So don't deque it. 
 	* To make sure no element is repeated twice, use a boolean array and do it.
 	* The Judge allows us to maintain a linear extra memory for each iterator.
 	*/
 	private class QueueIterator<Item> implements Iterator<Item>{
 		private boolean isVisited[];
 		private int visitedElements;
 		private int queueSize;
 		
 		public QueueIterator(int size){
 			isVisited = new boolean[size];
 			queueSize = size;
 		}
 		

 		public boolean hasNext(){
 			return (visitedElements != queueSize) ;
 		}
 		

 		public Item next(){
 			Item currentItem;
 			int randomNum;
 			if (hasNext()) { // Get a random Position, see if it is not visited and give it
 			   // Get a Random Number 
 			    Random rand = new Random();
			    do{
			    	randomNum = rand.nextInt(((queueSize-1) - 0) + 1) + 0;
		//		System.out.println("Random Element:"+ randomNum);
						    	
			    }while( isVisited[randomNum] == true );
			    currentItem = (Item) item[randomNum];
			    
			    // Mark the Element 
			    isVisited[randomNum] = true;
			    
			   // Increment the count;
			   visitedElements++;
 			} else { //  Say there are no more elements
 				    throw new NoSuchElementException("No more element exists");
 			
 			}
 			return currentItem;
 		}
 		
 		public void remove(){
 			throw new java.lang.UnsupportedOperationException("Operation currently not supported : Remove");
 		}
 		
 	}

 	/*
 	* Unit Testing
 	*/
 	public static void main(String[] args){
		/*
		* Check if the Queue is Proper. Add and remove items.
		*/			 	
		
		RandomizedQueue<String> rQ = new RandomizedQueue<String>();
		
		rQ.enqueue("Salaikumar");
		rQ.enqueue("Ashwanth");
		rQ.enqueue("Ashwin Ramesh");
		rQ.enqueue("Vijay Kumar");						
		rQ.enqueue("Giri Prasad");
		
		while (!rQ.isEmpty() ) { // Untill the Queue not empty, print the element.
		   System.out.println(rQ.dequeue());
		}		
		
		// The Problem in the above code is the Random number generator
		//  it is not supposed to return the same number returned.
		//  Let us see a way to fix it later on
		
		/*
		* Test The iterator. It should work fine -- Lets see
		*/
		/*
		rQ.enqueue("Salaikumar");
		rQ.enqueue("Ashwanth");
		rQ.enqueue("Ashwin Ramesh");
		rQ.enqueue("Vijay Kumar");						
		rQ.enqueue("Giri Prasad");

		Iterator it = rQ.iterator();
		System.out.println("Iterator 1");
		while (it.hasNext()) { // 
		   System.out.println(it.next());
		}
		
		System.out.println("---------------------------");
		
		Iterator it2 = rQ.iterator();
		System.out.println("Iterator 2");
		while (it2.hasNext()) { // 
		   System.out.println(it2.next());
		}
		
		*/		
		
 	} 	
}

