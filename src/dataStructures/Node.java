package dataStructures;

/*
 *  Node is the element of BST. 
 */
public class Node {

	/*
	 *  Data Part
	 *  Implemented as  Key-Value Pair
	 */
	int iData;
	double dData;
	
	/*
	 * Link Part. 
	 * Contains Branch to left Child and Right Child
	 * Link to Parent may be added in future as per application need
	 */
	Node leftChild;
	Node rightChild;
	
	/*
	 * Constructor.
	 */
	
	public Node(int key, double value){
		
		iData = key;
		dData = value;
		leftChild = null;
		rightChild = null;
	}
	
	/*
	 * Method to display Node
	 */
	public void display(){
		System.out.println("*****************************************");
		System.out.println("Key"+ iData);
		System.out.println("Value"+ dData);
		System.out.println("*****************************************");
		
	}
}
