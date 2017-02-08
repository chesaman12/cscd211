import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinkedListAddAtIndexTests {

	private static LinkedList list;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		list = new LinkedList();
		
	}
	

	@Before
	public void setUp() throws Exception {
		list = new LinkedList();
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddAtNegativeIndexIntObject() {
	
		list.addFirst("first");
		list.addAtIndex(-1, "new item");
	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddAtTooLargeIndexIntObject() {
		
		list.addFirst("first");
		list.addAtIndex(2, "new item");
	
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddAtIndexIntObjectIsNull() {
		list.addFirst("first");
		String s = null;
		list.addAtIndex(0, s);
	}
	
	@Test
	public void testAddAtIndexSameAsSizeIntObject() {
		try{
			list.addFirst("first");
			list.addAtIndex(1, "new item");
			assertEquals("List size is: 2\r\nfirst\r\nnew item\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddAtIndexSameAsSizeIntObject: " + e.getMessage());
		}
	}
	
	
	@Test
	public void testAddAtIndex0IntObject() {
		try{
			list.addFirst("first");
			list.addAtIndex(0, "new item");
			assertEquals("List size is: 2\r\nnew item\r\nfirst\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddAtIndex0IntObject: " + e.getMessage());
		}
	}
	
	@Test
	public void testAddAtIndex0ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(0, "new item");
			assertEquals("List size is: 8\r\nnew item\r\n0\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddAtIndex0ListSize7IntObject: " + e.getMessage());
		}
	}
	
	@Test
	public void testAddAtIndex2ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(2, "new item");
			assertEquals("List size is: 8\r\n0\r\n1\r\nnew item\r\n2\r\n3\r\n4\r\n5\r\n6\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddAtIndex2ListSize7IntObject: " + e.getMessage());
		}
	}
	
	@Test
	public void testAddAtIndex3ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(3, "new item");
			assertEquals("List size is: 8\r\n0\r\n1\r\n2\r\nnew item\r\n3\r\n4\r\n5\r\n6\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddAtIndex3ListSize7IntObject: " + e.getMessage());
		}
	}
	
	@Test
	public void testAddAtIndex6ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(6, "new item");
			assertEquals("List size is: 8\r\n0\r\n1\r\n2\r\n3\r\n4\r\n5\r\nnew item\r\n6\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddAtIndex6ListSize7IntObject: " + e.getMessage());
		}
	}
	
	@Test
	public void testAddAtIndex7ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(7, "new item");
			assertEquals("List size is: 8\r\n0\r\n1\r\n2\r\n3\r\n4\r\n5\r\n6\r\nnew item\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testAddAtIndex7ListSize7IntObject: " + e.getMessage());
		}
	}
	
	
	

}
