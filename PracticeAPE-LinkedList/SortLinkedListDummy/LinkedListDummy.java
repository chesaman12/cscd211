/*
 * Given the following LinkedListDummy class, write the code for the stubbed
 * out sort method at the bottom of the class.
 * 
 * You may use any sort algorithm you wish, but may not make any calls to sort methods in 
 * the Java API (the work needs to be your own).
 */

//Linked list with dummy/buffer node that head always points at.
public class LinkedListDummy {

	// nested Node class
	private class Node {
		private Comparable data;
		private Node next;

		private Node() {
			this(null, null);

		}// end default Node constructor

		private Node(Comparable data, Node next) {
			this.data = data;
			this.next = next;
		}// end parameterized Node constructor

	}// end nested class Node

	private Node head;
	private int size;

	public LinkedListDummy() {

		this.head = new Node(null, null);
		this.size = 0;

	}// end default LinkedList constructor

	public int size() {
		return this.size;
	}// end size method

	@Override
	public String toString() {

		String result = "";

		result += "List size is: " + this.size + "\r\n";

		for (Node cur = this.head.next; cur != null; cur = cur.next) {
			result += cur.data + "\r\n";
		} // end for

		return result;

	}// end toString method

	void addFirst(Comparable data) {

		this.head.next = new Node(data, this.head.next);
		this.size++;

	}// end addFirst

	public void sort() {
		if (this.size > 1) {
			Node search, start, min;
			Comparable temp;
			for (start = this.head.next; start.next != null; start = start.next) {
				min = start;
				for (search = start.next; search != null; search = search.next) {
					if (search.data.compareTo(min.data) < 0) {
						min = search;
					}
					temp = min.data;
					min.data = start.data;
					start.data = temp;
				}

			}
		}

	} // end sort

}// end LinkedListDummy
