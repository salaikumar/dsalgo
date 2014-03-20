/**
 * 
 */
package dataStructures;

/**
 * @author Salaikumar Saravanan
 * 
 *         BinarySearchtTree is a vastly used Data Structure in real time
 *         applications Here is a simple implementation of BST.
 */
public class BinarySearchTree {

	/*
	 * Reference to the root
	 */
	Node root;

	/*
	 * Constructor
	 */
	public BinarySearchTree(Node reference) {

		root = reference;
	}

	/*
	 * Search a node in BST
	 */
	public Node searchNode(int key) {

		Node current = root;

		while (current.iData != key) {

			if (key < current.iData)
				current = current.leftChild;
			else
				current = current.rightChild;

			if (current == null)
				return null;

		}

		return current;
	}

	/*
	 * Inserts a new node into the tree.
	 */
	public void insertNode(int key, double value) {

		/*
		 * Create a new node
		 */
		Node newNode = new Node(key, value);

		if (root == null) {
			root = newNode;

		} else {

			Node current = root;
			Node parent = null;
			while (current != null) {

				if (key < current.iData) {

					parent = current;
					current = current.leftChild;

				} else {

					parent = current;
					current = current.rightChild;
				}

			}

			if (key < parent.iData)
				parent.leftChild = newNode;
			else
				parent.rightChild = newNode;

		}
	}

	/*
	 * Tree Traversal In order Traversal.
	 */
	public void inOrder(Node localNode) {

		if (localNode != null) {

			/*
			 * Visit the left Node
			 */
			inOrder(localNode.leftChild);

			/*
			 * Visit the current Node
			 */
			localNode.display();

			/*
			 * Visit the right node
			 */
			inOrder(localNode.rightChild);

		}

	}

	/*
	 * PreOrder Traversal
	 */
	public void preOrder(Node localNode) {

		if (localNode != null) {

			/*
			 * Visit the Current Node
			 */
			localNode.display();

			/*
			 * Visit the left Child
			 */
			preOrder(localNode.leftChild);

			/*
			 * Visit the right child
			 */
			preOrder(localNode.rightChild);

		}

	}
	
	/*
	 * Post Order Traversal
	 */
	public void postOrder(Node localNode){
		
		if( localNode  != null){
			
			/*
			 *  Visit the leftNode
			 */
			postOrder(localNode.leftChild);
			
			/*
			 * Visit the rightChild 
			 */
			postOrder(localNode.rightChild);
			
			/*
			 * Visit the currentNode
			 * 
			 */
			localNode.display();
		}
		
	}

}