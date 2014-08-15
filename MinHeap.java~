/*
* Implementation of MinHeap using Linked list as basic DS
* Binary MinHeap
*/


/*
* This implementation of MinHeap with LinkedList involves some extra operations at every step.
* Implementation of MinHeap with Array resizing is a better option
*/

class MinHeapNode<Key>{

	/*
	* Structure of Heap
	*/
	 Key value;			// Value Holder 
	 MinHeapNode parent;		// Pointer to Parent Node
	 MinHeapNode leftChild;		// Pointer to left Child
	 MinHeapNode rightChild;	// Pointer to right child
	
	// Implementation of the basic methods
	public void MinHeapNode(Key value,MinHeapNode parent, 
				MinHeapNode leftChild,MinHeapNode rightChild){

		this.value = value;
		this.parent = parent;
		this.leftChild = leftChild;
		this.rightChild = rightChild;

	}

	// Create a node with value alone;
	public MinHeapNode(Key value){
		this.value = null;
		this.parent = null;
		this.leftChild = null;
		this.rightChild = null;
	}

	// Methods to set and get the left, right and parent of the node
	public void setParent(MinHeapNode parent){
		this.parent = parent;
	}
	
	public MinHeapNode getParent(){
		return parent;
	}

	public void setLeftChild(MinHeapNode leftChild){
		this.leftChild = leftChild;
	}
	
	public MinHeapNode getLeftChild(){
		return leftChild;
	}

	public void setRightChild(MinHeapNode rightChild){
		this.rightChild = rightChild;
	}
	
	public MinHeapNode getRightChild(){
		return rightChild;
	}
	
}

public class MinHeap<Key extends Comparabale<Key>>{

	// Holds the root.
	// The root of MinHeap - The smallest element in the heap
	MinHeapNode rootNode = null;
	
	// Number of elements in the heap.
	int counter;
	
	public void insert(Key value){
			
		// First create a new MinHeap Node
		MinHeapNode node = new MinHeapNode(value);		
		
		/*
		* Now the biggest question, where will you insert it in the heap?
		* Lets try to answer it over here
		*/

		// Check if it is the first element to be inserted
		if(rootNode == null){
			rootNode = node;
			node.setLeftChild(null);
			node.setRightChild(null);
		}


	}				


}

