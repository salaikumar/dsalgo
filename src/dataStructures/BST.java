/*
 * A Generalized Implementation of BST. 
 * A Warm up before implementing B-Tree and more. 
 * The API as mentioned in algorithms course is followed
 */

// Salai, One kingdom at a time. You'll not get answer for all your questions at once. 
//Solve one by one

package dataStructures;

import java.util.NoSuchElementException;

// Never miss the generalization here
// You need to compare keys, right?? Don't you? 
public class BST<Key extends Comparable<Key>, Value> {

	// Root of the BST
	// Want to know What Node is, Look down.
	private Node root;

	public class Node {
		// The Key part
		Key key;
		// The value part
		Value value;
		// Left Part < Root
		Node left;
		// Right Part > Root
		Node right;
	}

	// Constructor, Makes the Initialization of the BST
	public BST(Key key, Value value) {

		// Get the root of the key from here.
		root = new Node();
		root.key = key;
		root.value = value;
		root.left = null;
		root.right = null;
	}

	/*
	 * Get the ceiling value for the key and send it.
	 */
	public Key ceiling(Key key) {

		return null;
	}

	/*
	 * Check if there is a entry with this key
	 */
	public boolean contains(Key key) {

		return false;
	}

	/*
	 * Deletes the key if present
	 */
	public void delete(Key key) {

	}

	/*
	 * Delete the node with maximum key value
	 */
	public void deleteMax() {

	}

	/*
	 * Delete the node with minimum key value
	 */
	public void deleteMin() {

	}

	/*
	 * Get the floor value of the current key
	 */
	public Key floor(Key key) {

		return null;
	}

	/*
	 * Get the value associated with the key
	 */
	public Value get(Key key) {

		// Check if such key exists
		if (!contains(key))
			throw new NoSuchElementException("No such key exists");

		return null;
	}

	/*
	 * Returns the height of the tree. You know what does the height of tree
	 * means right?? By now, not clear.. Fuck
	 */
	public int height() {
		return 1;
	}

	/*
	 * Returns true of the tree is null
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/*
	 * Return all the keys
	 */
	public Iterable<Key> keys() {

		return null;
	}

	/*
	 * Return the set of keys within the given range
	 */
	public Iterable<Key> keys(Key lo, Key hi) {

		return null;
	}

	/*
	 * No Idea what this method is. But, mentioned in API.Lets find out during
	 * implementation
	 */
	public Iterable<Key> levelOrder() {
		return null;
	}

	/*
	 * Returns the maximum Key
	 */
	public Key max() {
		return null;
	}

	/*
	 * Returns the min key in the tree
	 */
	public Key min() {
		return null;
	}

	/*
	 * Insert an element in the key.
	 */
	public void put(Key key, Value value) {

		// The most important method. To be implemented first
	}

	/*
	 * Get the rank of the given Key. (So, I should use Array?Come on..)
	 */
	public int rank(Key key) {

		return -1;
	}

	/*
	 * Get the Key for the given rank
	 */
	public Key select(int rank) {

		return null;
	}

	/*
	 * Gives the size of the try
	 */
	public int size() {

		return -1;
	}

	/*
	 * Gives the size of the tree within given range
	 */
	public int size(Key lo, Key hi) {

		return -1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
