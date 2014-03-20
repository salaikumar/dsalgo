/**
 * 
 */
package dataStructures;

/**
 * @author Salaikumar
 *
 */


// Node class
class Node {
 
	//Key Part
	Integer key;
	
	// Value part 
	String value;
	
	//Link Part 
	Node next;
	
	// Constructor to create a node
	Node(int key , String value){
		
		this.key = key;
		this.value = value;
		
	}
	
	// Displays the Node
	public void displayNode(){
		
		System.out.println("___________________");
		System.out.println(" KEY " + key );
		System.out.println(" VALUE " + value);
		System.out.println("___________________");
	}
}

// Class LinkedList 
class LinkedList{
	
	private Node first;
	
	// Creates a empty list
	LinkedList(){
		
		first = null;
	}
	
	// Check if the list is Empty or not
	public boolean isEmpty(){
		
		return (first==null);
	}
	
	//Insert a node into the list
	public void insertFirst(int key , String value)
	{
		
		// Creates a newNode
		Node newNode = new Node(key, value);
		
		//Add it to the list 
		newNode.next = first;
		
		//Move the header
		first = newNode;
		
	}
	
	
	public Node findNode(int key){
		
		if( first.key != key){
			
			
			Node temp = first;
			
			while( temp.key != key)
			{
				// if not found
				if (temp.next == null)
				{
					return null;
				}
			
				// Move to next node
				temp = temp.next;
			}
			
			
			 return temp;
			
			
		}
		
		else{
			
			return first;
		}
			
	}
	
	//Deletes the first node in the list
	public Node deleteFirst(){
		
		// Get the First Node
		Node temp = first;
		
		// Move the header
		first = first.next;
		
		// Return the node to be deleted
		return temp;
	}
	
	
	// Delete Node with Key value
	public Node deleteNode(int key){
	
		if (first.key != key){
		
			// A temp holder
			Node temp = first;
			
			//Get the previous node of it.
			Node previous = first;
			
			// Get the node with the key value specified
			while ( temp.key != key){
			
				// if value is not found
				if (temp.next == null)
				{
					return null;
				}
				
				// Get the previous Node
				previous = temp;
				
				//Move to the next node
				temp = temp.next;
			}
			
			// Remove the link to the current node
			previous.next = temp.next;
			
			return temp;
		}
		
		else
		{
			
			first = first.next;
			return first;
		}
		
		
	}
	
	// Display the List
	public void displayList(){
		
		System.out.println("First->Last");
		
		// Get the First node
		Node current = first;
		
		//Loop until there is a link
		while ( current != null){

			// Print the Node
			current.displayNode();
			
			// Move to next Node
			current = current.next;
		}
	}
	
}

public class Sll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create a new LinkedList
		LinkedList newList = new LinkedList();
		
		
		//Add some Nodes to it.
		newList.insertFirst(1, "Salaikumar Saravanan");
		newList.insertFirst(2, "Ashwanth Kumar");
		newList.insertFirst(3, "Lakshmi Narayanan B");
		newList.insertFirst(4, "Kaushik Sampath Kumar");
		newList.insertFirst(5, "Lakshmi Narayanan G");
		newList.insertFirst(6, "Narendar Nirmal");
		newList.insertFirst(7, "Krishna Pansari");
		
		// Delete One Node from it
		//newList.deleteFirst();
		
		
		newList.deleteNode(3);
		newList.deleteNode(7);
		newList.deleteNode(9); // No such key. Your Code should not break at this point
		
		Node found = newList.findNode(9);
		
		if(found != null)
		{
			found.displayNode();
		}
		else{
			System.out.println("Node not found for given key");
		}
		
		// Display the List
		newList.displayList();
	}

}


