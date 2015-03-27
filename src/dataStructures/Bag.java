/*
 *  Author : Salaikumar
 *  Implementation of Bag dataStructure. 
 *  Needed it typically for Implementing Adjacency list for Graphs.
 */
package dataStructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item> {

	// Size of Bag
	private int N;

	// Holds the first item in the bag
	Node<Item> firstItem;

	/*
	 * The Node class Helps to hold the Item
	 */
	private class Node<Item> {

		private Item item;
		private Node<Item> next;

	}

	/*
	 * Default Constructor
	 */
	public Bag() {

		N = 0;
		firstItem = null;
	}

	/*
	 * Checks if the bag is empty
	 */
	public boolean isEmpty() {

		return (firstItem == null);
	}

	/*
	 * returns the current size of the bag
	 */
	public int size() {

		return N;
	}

	/*
	 * Adds an Item into the bag
	 */
	public void add(Item item) {

		// Copy the firstItem
		Node<Item> temp = firstItem;

		// Create space for new Item
		firstItem = new Node<Item>();
		firstItem.item = item;
		firstItem.next = temp;

		// Increment the size
		N++;
	}

	@Override
	public Iterator<Item> iterator() {
		/*
		 * Return the Instance of your Iterator Class.
		 */
		return new MyIterator<Item>(firstItem);
	}

	/*
	 * The Iterator class
	 */
	private class MyIterator<Item> implements Iterator<Item> {

		private Node<Item> current;

		public MyIterator(Node<Item> first) {

			current = first;
		}

		@Override
		public boolean hasNext() {

			return (current != null);
		}

		@Override
		public Item next() {

			if (!hasNext()) {
				throw new NoSuchElementException();
			}

			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {

			throw new UnsupportedOperationException();

		}

	}
	
	
	 /**
     * Unit tests the <tt>Bag</tt> data type.
     */
    public static void main(String[] args) {
        Bag<String> bag = new Bag<String>();
        bag.add("Salaikumar");
        bag.add("23");
        System.out.println(bag.size());
    }
}
