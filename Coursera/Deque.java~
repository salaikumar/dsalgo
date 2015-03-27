/*
* Assigment 2 - Deque  Implementation.
* Deque -> Add and remove items from both front and back. Generalization of Stack and Queue
*/

import java.io.*;
import java.lang.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class Deque<Item> implements Iterable<Item>{
	
	private int size;
    	private Node<Item> front;
    	private Node<Item> end;
	
	private class Node<Item>{
		private Item item;
		private Node<Item> front;
		private Node<Item> back;

    	}
	
	/*
	* Constuctor
	*/
	public Deque(){
		front = null;
	        end = null;
	}
	
	/*
	*  Tells if the Deque is empty
	*/
	public boolean isEmpty(){
		return size == 0;
	}
	
	/*
	*  Returns the size of the Deque
	*/
	public int size(){
		return size;
	}
	
	/*
	*
	*/
	public void addFirst(Item item){
		if (item == null)
            		throw new NullPointerException("Given Item is Null");
//      Create a new Node.
       		Node<Item> newNode = new Node<Item>();
        	newNode.item = item;
		if (isEmpty()){
		    front = newNode;
		    end = newNode;
		}
		else{
		    newNode.back = front;
		    front.front = newNode;
		    front = newNode;

		}
		size++;
	}
	
	/*
	*
	*/
	public void addLast(Item item){
		if (item == null)
            		throw new NullPointerException("Given Item is Null");
		Node<Item> newNode = new Node<Item>();
		newNode.item = item;
		if (isEmpty()){
		    front = newNode;
		    end = newNode;
		}
		else{
		    newNode.front = end;
		    end.back = newNode;
		    end = newNode;
		}
		size++;
	}
	
	/*
	*
	*/
	public Item removeFirst(){
		if(isEmpty())
	            throw new NoSuchElementException("Queue underflows");
		Item frontItem = front.item;
		if (front.back != null){
		    Node<Item> newFront = front.back;
		    newFront.front = null;
		    front.back = null;
		    front = newFront;
		}
		else{
		    front = end  = null;
		}
		size--;
		return frontItem;
	}
	
	public Item removeLast(){
		if(isEmpty())
	            throw new NoSuchElementException("Queue underflows");
		Item endItem = end.item;
		if ( end.front != null){
		    Node<Item> newEnd = end.front;
		    newEnd.back = null;
		    end.front = null;
		    end = newEnd;
		}
		else{
		    front = end = null;
		}
		size--;
		return endItem;
	}
	
    /*
    * Iterator Class and Methods
    */
//    @Override
    public Iterator<Item> iterator() {
        return new listIterator<Item>(front);
    }

    private class listIterator<Item> implements Iterator<Item> {

        Node<Item> current;
        public listIterator(Node<Item> front) {
            current = front;
        }

  //      @Override
        public boolean hasNext() {
            return current != null;
        }

    //    @Override
        public Item next() {
            Item  currentItem = null;      
            if ( hasNext()) {
                currentItem = current.item;
                current = current.back;
            }
            else
              throw new NoSuchElementException("No more elements in Deque");
            return currentItem;
        }

      //  @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation currently not supported");
        }
    }
    
     /*
    * Main Method -- Unit Testing.
    * It will not be used by us anyhow here. -- Implemented so that it will be used in Online Judge
    */
    public static void main(String[] args){
	Deque<String> deque = new Deque<String>();
	
	deque.addFirst("Salaikumar");
	deque.addLast("Ashwanth Kumar");	
	deque.addFirst("Shilpa PS");
	deque.addFirst("Shilu");
	deque.addLast("Vijay Kumar");
	deque.addLast("Shilu");
	
	System.out.println("-----Test Cases-----");
	System.out.println("Remove First:" + deque.removeFirst());
	System.out.println("Remove First:" + deque.removeFirst());
	System.out.println("Remove Last :" + deque.removeLast());
    }

	
}	
