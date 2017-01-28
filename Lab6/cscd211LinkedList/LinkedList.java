package cscd211LinkedList;

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
	}

	private Node head;
	private int size;

	public LinkedList() {
		this.head = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public void clear() {
		this.head = null;
		this.size = 0;
	}

	public void addFirst(java.lang.Comparable item) {

		add(size, item);

		// if (item == null)
		// throw new IllegalArgumentException("item is null");
		//
		// Node nn = new Node(item);
		// if (this.size == 0) {
		// this.head = nn;
		// this.size++;
		// } else {
		// nn.next = this.head;
		// this.head = nn;
		// this.size++;
		// }

	}

	public int indexOf(Comparable item) {
		if (item == null)
			throw new IllegalArgumentException("item is null");
		Node cur = this.head;
		Node prev = null;
		int counter = 0;
		while (cur != null && cur.data.compareTo(item) != 0) {
			cur = cur.next;
			counter++;
		}
		if (cur == null) {
			return -1;
		} else {
			return counter;
		}
	}

	public Comparable removeFirst() {
		if (this.size == 0)
			throw new IllegalArgumentException("list is null");
		Comparable item = this.head.data; // make sure this works without cur
											// place holder
		this.head = this.head.next;
		size--;
		return item;

	}

	public Comparable removeLast() {
		if (this.size == 0)
			throw new IllegalArgumentException("list is null");
		Node cur = this.head;
		Node prev = null;
		while (cur.next != null) {
			prev = cur;
			cur = cur.next;
		}
		return cur.data;

	}

	public Comparable remove(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index out of bounds");
		Node cur = this.head;
		Node prev = null;
		for (int ix = 0; ix < index; ix++) {
			prev = cur;
			cur = cur.next;
		}

		prev.next = cur.next;
		size--;
		return cur.data;

	}

	public void add(int index, Comparable item) {
		// System.out.println(index + " " + size); //tester
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException("Index out of bounds");
		if (item == null)
			throw new IllegalArgumentException("item is null");
		Node cur = this.head;
		Node prev = null;
		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			size++;
		} else {

			for (int ix = 0; ix < index; ix++) {
				prev = cur;
				cur = cur.next;
			}
			prev.next = nn;
			nn.next = cur;
		}
	}

	public boolean removeLastOccurrence(Comparable item) {
		if (item == null)
			throw new IllegalArgumentException("item is null");
		Node cur = this.head;
		Node cur1 = this.head;
		Node prev = null;
		Node prev1 = null;
		int counter = 0;
		while (cur != null) {
			prev = cur;
			cur = cur.next;
			if (cur.data.compareTo(item) == 0) {
				counter++;
			}
			if (counter == 0) {
				return false;
			}

		}
		while (counter > 0) {
			if (cur.data.compareTo(item) == 0) {
				counter--;
			}
			prev1 = cur1;
			cur1 = cur1.next;
		}
		prev1.next = cur1.next;
		return true;

	}

	public boolean removeFirstOccurrence(Comparable item) {
		if (item == null)
			throw new IllegalArgumentException("item is null");
		Node cur = this.head;
		Node cur1 = this.head;
		Node prev = null;
		Node prev1 = null;
		int counter = 0;
		while (cur != null) {
			prev = cur;
			cur = cur.next;
			if (cur.data.compareTo(item) == 0) {
				counter++;
			}
			if (counter == 0) {
				return false;
			}
		}

		while (cur.data.compareTo(item) != 0) {
			prev = cur;
			cur = cur.next;
		}
		prev1.next = cur1.next;
		return true;

	}

	public void addLast(Comparable item) {

		// TODO - do it this way, it is much cleaner!
		add(size, item);

		// if (item == null)
		// throw new IllegalArgumentException("item is null");
		//
		// Node nn = new Node(item);
		//
		// Node cur = this.head;
		// if (cur == null) {
		// // the list is empty
		// this.head = nn;
		// } else {
		//
		// Node last = null;
		//
		// while (cur != null) {
		// last = cur;
		// cur = cur.next;
		// }
		// last.next = nn;
		// size++;
		//
		// }

	}

	@Override
	public String toString() {
		if (this.size == 0) {
			return "Empty List";
		} else {
			String result = "";
			Node cur = this.head;
			result = cur.data + ", ";
			while (cur.next != null) {
				cur = cur.next;
				result += cur.data + ", ";
			}
			return "[" + result + "]";
		}
	}

	public boolean contains(Comparable item) {
		if (item == null)
			throw new IllegalArgumentException("item is null");
		Node cur = this.head;
		Node prev = null;
		while (cur != null) {
			if (cur.data.compareTo(item) == 0) {
				return true;
			}
			prev = cur;
			cur = cur.next;
		}
		return false;
	}
}
