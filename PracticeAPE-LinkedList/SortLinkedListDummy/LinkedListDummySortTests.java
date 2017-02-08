import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListDummySortTests {
	
	private LinkedListDummy list;

	@Test
	public void testSortListEmpty() {
		try{
			list = new LinkedListDummy();
			list.sort();
			
			assertEquals("List size is: 0\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListEmpty");
		}
	}
	
	@Test
	public void testSortListOneItem() {
		try{
			list = new LinkedListDummy();
			list.addFirst("first");
			list.sort();
			
			assertEquals("List size is: 1\r\nfirst\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListEmpty");
		}
	}
	
	@Test
	public void testSortListTwoItems() {
		try{
			list = new LinkedListDummy();
			list.addFirst("first");
			list.addFirst("second");
			list.sort();
			
			assertEquals("List size is: 2\r\nfirst\r\nsecond\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTwoItems");
		}
	}

	@Test
	public void testSortListTwoItemsSorted() {
		try{
			list = new LinkedListDummy();
			list.addFirst("second");
			list.addFirst("first");
			list.sort();
			
			assertEquals("List size is: 2\r\nfirst\r\nsecond\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTwoItemsSorted");
		}
	}

	@Test
	public void testSortListThreeItems() {
		try{
			list = new LinkedListDummy();
			list.addFirst("first");
			list.addFirst("second");
			list.addFirst("third");
			list.sort();
			
			assertEquals("List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListThreeItems");
		}
	}
	
	@Test
	public void testSortListThreeItemsSorted() {
		try{
			list = new LinkedListDummy();
			list.addFirst("third");
			list.addFirst("second");
			list.addFirst("first");
			list.sort();
			
			assertEquals("List size is: 3\r\nfirst\r\nsecond\r\nthird\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListThreeItemsSorted");
		}
	}
	
	@Test
	public void testSortListTenItemsSorted() {
		try{
			list = new LinkedListDummy();
			list.addFirst("tomato");
			list.addFirst("persimmon");
			list.addFirst("orange");
			list.addFirst("lime");
			list.addFirst("lemon");
			list.addFirst("kumquat");
			list.addFirst("grape");
			list.addFirst("cherry");
			list.addFirst("banana");
			list.addFirst("apple");
			list.sort();
			
			assertEquals("List size is: 10\r\napple\r\nbanana\r\ncherry\r\ngrape\r\nkumquat\r\nlemon\r\nlime\r\norange\r\npersimmon\r\ntomato\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTenItemsSorted");
		}
	}

	@Test
	public void testSortListTenItemsRandom() {
		try{
			list = new LinkedListDummy();
			list.addFirst("apple");
			list.addFirst("cherry");
			list.addFirst("persimmon");
			list.addFirst("orange");
			list.addFirst("tomato");
			list.addFirst("kumquat");
			list.addFirst("lemon");
			list.addFirst("grape");
			list.addFirst("lime");
			list.addFirst("banana");
			
			list.sort();
			
			assertEquals("List size is: 10\r\napple\r\nbanana\r\ncherry\r\ngrape\r\nkumquat\r\nlemon\r\nlime\r\norange\r\npersimmon\r\ntomato\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTenItemsRandom");
		}
	}
	
	@Test
	public void testSortListTenItemsDuplicates() {
		try{
			list = new LinkedListDummy();
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("lime");
			list.addFirst("orange");
			list.addFirst("lemon");
			list.addFirst("grape");
			list.addFirst("lemon");
			list.addFirst("grape");
			list.addFirst("lime");
			list.addFirst("orange");
			
			list.sort();
			
			assertEquals("List size is: 10\r\napple\r\napple\r\ngrape\r\ngrape\r\nlemon\r\nlemon\r\nlime\r\nlime\r\norange\r\norange\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testSortListTenItemsDuplicates");
		}
	}

}
