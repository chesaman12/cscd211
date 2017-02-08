import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedLIstDummyDeleteAllOccurrencesTests {
	
	private static LinkedListDummy list;
	
	@Before
	public void setUp() throws Exception {
		list = new LinkedListDummy();
	}
	
	@Test
	public void testDeleteAllOccurrencesEmptyList() {
		try{
			int count;
			count = list.deleteAllOccurrences("apple");
			
			assertEquals(0, count);
			assertEquals("List size is: 0\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testDeleteAllOccurrencesEmptyList: " + e.getMessage());
		}
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDeleteAllOccurrencesDataIsNull() {
		int count;
		
		count = list.deleteAllOccurrences(null);
		assertEquals(0, count);
		assertEquals("List size is: 0\r\n", list.toString());
		
	}
	
	@Test
	public void testDeleteAllOccurrencesOneItemListItemNotThere() {
		try{
			int count;
			list.addFirst("single item");
			count = list.deleteAllOccurrences("apple");
			
			assertEquals(0, count);
			assertEquals("List size is: 1\r\nsingle item\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testDeleteAllOccurrencesOneItemListItemNotThere: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testDeleteAllOccurrencesOneItemListItemIsThere() {
		try{
			int count;
			list.addFirst("apple");
			count = list.deleteAllOccurrences("apple");
			
			assertEquals(1, count);
			assertEquals("List size is: 0\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testDeleteAllOccurrencesOneItemListItemIsThere: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testDeleteAllOccurrencesDuplicateFiveItemListItemIsThere() {
		try{
			int count;
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("apple");
			count = list.deleteAllOccurrences("apple");
			
			assertEquals(5, count);
			assertEquals("List size is: 0\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testDeleteAllOccurrencesDuplicateFiveItemListItemIsThere: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testDeleteAllOccurrencesFiveItemListItemIsThere3Times() {
		try{
			int count;
			list.addFirst("apple");
			list.addFirst("banana");
			list.addFirst("apple");
			list.addFirst("cherry");
			list.addFirst("apple");
			count = list.deleteAllOccurrences("apple");
			
			assertEquals(3, count);
			assertEquals("List size is: 2\r\ncherry\r\nbanana\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testDeleteAllOccurrencesFiveItemListItemIsThere3Times: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testDeleteAllOccurrences5ItemListItemIsThere2Times() {
		try{
			int count;
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("grape");
			list.addFirst("cherry");
			list.addFirst("banana");
			count = list.deleteAllOccurrences("apple");
			
			assertEquals(2, count);
			assertEquals("List size is: 3\r\nbanana\r\ncherry\r\ngrape\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testDeleteAllOccurrences5ItemListItemIsThere2Times: " + e.getMessage());
		}
		
	}
	
	@Test
	public void testDeleteAllOccurrences5ItemListItemIsThere1Time() {
		try{
			int count;
			list.addFirst("apple");
			list.addFirst("pineapple");
			list.addFirst("grape");
			list.addFirst("cherry");
			list.addFirst("banana");
			count = list.deleteAllOccurrences("apple");
			
			assertEquals(1, count);
			assertEquals("List size is: 4\r\nbanana\r\ncherry\r\ngrape\r\npineapple\r\n", list.toString());
		}
		catch(Exception e){
			fail("Exception occurred in testDeleteAllOccurrences5ItemListItemIsThere1Time: " + e.getMessage());
		}
		
	}


}
