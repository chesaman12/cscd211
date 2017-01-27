package cscd211LinkedList;

public class LinkedList {
	private class Node{
		public Comparable data;
		public Node next;
		
		public Node(Comparable data)
		{
			this.data = data;
		}
		
		public Node(Comparable data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
		private Node head;
		private int size;
		
		public LinkedList()
		{
			this.head = null;
			this.size = 0;
		}
		
		public int size()
		{
			return this.size;
		}
		
		public void clear()
		{
			this.head = null;
			this.size = 0;
		}
		
		public void addFirst( Comparable item)
		{
			
		}
		
	
}
