/*
* You have two numbers represented by a linked list, where each node contains a sin-
gle digit. The digits are stored in reverse order, such that the 1’s digit is at the head of
the list. Write a function that adds the two numbers and returns the sum as a linked
list.
EXAMPLE
Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
Output: 8 -> 0 -> 8
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AddNumbers{

	// Java Inbuilt Linked List or your own linked list
	// My own.
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);		
		// Length of Number 1 and Number 2	
		int n1,n2;
		n1 = input.nextInt();
		n2 = input.nextInt();
		// Get Number 1
		Node header = new Node(input.nextInt());
		SingleLinkedList number1 = new SingleLinkedList(header);
		while( number1.count < n1){
			number1.addToTail(input.nextInt());
		}	
		// Get Number 2
		header = new Node(input.nextInt());
		SingleLinkedList number2 = new SingleLinkedList(header);
		while(number2.count < n2){
			number2.addToTail(input.nextInt());
		}
		addNumbers(number1 ,number2);
	}
	private static void addNumbers(SingleLinkedList number1, SingleLinkedList number2){
		SingleLinkedList sum = new SingleLinkedList();
		Node current1 = number1.header;
		Node current2 = number2.header;
		int summ = 0 , carry = 0;
		while(true){
			if(current1 == null && current2 == null){
				// No data;	
				break;
			}
			summ =	 carry;
			if(current1 != null){
				summ = summ + current1.data;
				current1 = current1.next;
			}
			if(current2 != null){
				summ = summ + current2.data;
				current2 = current2.next;
			}
			if(summ >=	 10)
				carry =1;
                        else
				carry = 0;
			// Add to the new LinkedList
			sum.addToTail(summ % 10);
		}
		sum.printList();		
	}
}

class SingleLinkedList{
	
       public Node header = null;
       int count =0;
       
       public SingleLinkedList(Node n){
		header = n;
		++count;
       }
    
       public SingleLinkedList(){
       }

      // Add a new node at the end       
       public void addToTail(int d){
	   Node newNode = new Node(d);
	   if(header == null){
		header = newNode;
	   }
	   else{
	   	Node current = header;
		// Navigate to the end.
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	 }
	 ++count;
	
       }	

      // Delete a Node
      public Node deleteNode(int d){
	Node current = header;
	if (header.data == d){
		header = header.next;		
	}
	while(current.next != null){
		if(current.next.data == d){
			current.next = current.next.next;
			return header;
		}
		current = current.next;
	}
	return header;		
      }
	
      public void printList(){
	  System.out.println("Complete List");
	  System.out.println();	
 	  Node current = header;
	  while( current != null){
		System.out.print( current.data + "->");
		current = current.next;
	  }
      }
}
class Node{
      public int data;
      public Node next=null;
      public Node(int d){
	data = d;	
      }		
}






