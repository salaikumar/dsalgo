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
	Nodes root;

	/*
	 * Constructor
	 */
	public BinarySearchTree(Nodes reference) {

		root = reference;
	}

	/*
	 * Search a node in BST
	 */
	public Nodes searchNode(int key) {

		Nodes current = root;

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
		Nodes newNode = new Nodes(key, value);

		if (root == null) {
			root = newNode;

		} else {

			Nodes current = root;
			Nodes parent = null;
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
	public void inOrder(Nodes localNode) {

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
	public void preOrder(Nodes localNode) {

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
	public void postOrder(Nodes localNode){
		
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
			 */
			localNode.display();
		}
		
	}

}