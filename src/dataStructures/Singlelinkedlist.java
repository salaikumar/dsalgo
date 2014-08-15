/**
 * 
 */
package dataStructures;

import java.util.Scanner;

/**
 * @author Salaikumar
 *
 */
public class Singlelinkedlist implements BasicOperations {

	// Value Part
	Integer value;
	// Link Part 
	Singlelinkedlist nextNode;
	
	public Singlelinkedlist(){
		
		value = null;
		nextNode = null;
	}
	
	public Singlelinkedlist(Integer value2, Singlelinkedlist temp) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	Singlelinkedlist temp = new Singlelinkedlist();
	
	
	@Override
	public void insertNode() {
		
		// Scanner to read the input
		 Scanner input = new Scanner(System.in);
		// Ask for Value from the user
		System.out.println("Give the Value");
		// Get the input
		value = input.nextInt();
		// Create a new node
		nextNode = new Singlelinkedlist ( value , temp );
		// Points to the new node created
		
		if (temp.nextNode.equals(null))
			temp.nextNode  = nextNode;
		
		
		//Prints the entire list
		printList();
		
	}

	@Override
	public void deleteNode() {
		
		// Scanner to read the input
		 Scanner input = new Scanner(System.in);
		// Ask for Value from the user
		System.out.println("Give the Value to be deleted");
		// Get the input
		value = input.nextInt();
		
		
		while (temp.nextNode != null)
		{
			
		
		}
	}

	@Override
	public void searchNode() {
		
		// Scanner to read the input
		 Scanner input = new Scanner(System.in);
		// Ask for Value from the user
		System.out.println("Search : ");
		// Get the input
		value = input.nextInt();
		
		if (temp.nextNode != null)
		{
			while (temp.nextNode.value != value)
			{
				temp.nextNode = nextNode.nextNode;
			}
			
		}
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateValue() {
		// TODO Auto-generated method stub
		
	}

}
