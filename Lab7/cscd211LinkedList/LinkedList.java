package cscd211LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
	private class Node {
		public Comparable data;
		public Node next;

		public Node(Comparable data) {
			this.data = data;
		}

		public Node(Comparable data, Node next) {
			this.data = data;
			this.next = next;
		}

		public Node() {
		}
	}

	private Node head;
	private int size;

	public LinkedList(Comparable[] array) {
		this.head = new Node(null);
		this.size = 0;
		addAll(0, array);
	}

	public int size() {
		return this.size;
	}

	public void clear() {
		this.head.next = null;
		this.size = 0;
	}

	public void addFirst(Comparable item) {
		if (item == null)
			throw new IllegalArgumentException("item is null");

		Node nn = new Node(item);
		if (this.head.next == null) {
			this.head.next = nn;
			this.size++;
		} else {
			nn.next = this.head.next.next;
			this.head.next = nn;
			this.size++;
		}
	}

	public Comparable removeLast() {
		if (this.size == 0)
			throw new IllegalArgumentException("list is null");
		Node cur = this.head.next;
		Node prev = this.head;
		while (cur.next != null) {
			prev = cur;
			cur = cur.next;
		}
		prev.next = null;
		size--;
		return cur.data;

	}

	public Comparable remove(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index out of bounds");
		Node cur = this.head.next;
		Node prev = this.head;
		for (int ix = 0; ix < index; ix++) {
			prev = cur;
			cur = cur.next;
		}

		prev.next = cur.next;
		size--;
		return cur.data;
	}

	@Override
	public String toString() {
		if (this.size == 0) {
			return "Empty List";
		} else {
			String result = "";
			Node cur = this.head.next;
			while (cur != null) {
				if (cur.next == null) {

					result += cur.data + "";
					cur = cur.next;
				} else {

					result += cur.data + ", ";
					cur = cur.next;
				}
			}
			return "[" + result + "]";
		}
	}

	public boolean add(Comparable item) {
		if (item == null)
			throw new IllegalArgumentException("item is null");
		Node nn = new Node(item);
		Node cur = this.head.next;
		Node prev = this.head;

		while (cur != null) {
			prev = cur;
			cur = cur.next;
		}
		prev.next = nn;
		size++;
		return true;

	}

	public boolean addAll(int index, Comparable[] array) {
		if (array == null)
			throw new IllegalArgumentException("item is null");
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("Index out of bounds");

		Node cur = this.head.next;
		Node prev = this.head;
		for (int ix = 0; ix < index; ix++) {
			prev = cur;
			cur = cur.next;
		}
		for (int ix = 0; ix < array.length; ix++) {
			prev.next = new Node(array[ix], cur);
			prev = prev.next;
			this.size++;
		}
		return true;
	}

	public Comparable get(int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("Index out of bounds");
		Node cur = this.head.next;
		Node prev = this.head;
		for (int ix = 0; ix < index; ix++) {
			prev = cur;
			cur = cur.next;
		}
		return prev.next.data;
	}

	public Comparable getLast() {
		if (size == 0)
			throw new NoSuchElementException("List is empty");
		Node cur = this.head.next;
		Node prev = this.head;
		while (cur != null) {
			prev = cur;
			cur = cur.next;
		}
		return prev.data;
	}

	public Comparable remove() {
		if (size == 0)
			throw new NoSuchElementException("List is empty");
		Comparable data = this.head.next.data;
		if (this.head.next.next == null) {
			this.head.next = null;
			size--;
		} else {
			this.head.next = this.head.next.next;
		}
		return data;
	}

	public Comparable[] toArray() {
		Node cur = this.head.next;
		Comparable[] array = new Comparable[size];
		for (int ix = 0; cur != null; ix++) {
			array[ix] = cur.data;
			cur = cur.next;
		}
		return array;
	}
}
