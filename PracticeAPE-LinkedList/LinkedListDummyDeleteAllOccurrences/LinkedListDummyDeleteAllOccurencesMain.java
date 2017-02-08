import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class LinkedListDummyDeleteAllOccurencesMain {
	
	private static LinkedListDummy list;
	
	
	public static void setUp() {
		list = new LinkedListDummy();
	}
	
	
	public static void testDeleteAllOccurrencesEmptyList() {
		try{
			int count;
			count = list.deleteAllOccurrences("apple");
			
			
			System.out.println("testDeleteAllOccurrencesEmptyList - list looks like: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testDeleteAllOccurrencesEmptyList: " + e.getMessage());
		}
		
	}
	
	
	public static void testDeleteAllOccurrencesDataIsNull() {
		try{
			int count;
			count = list.deleteAllOccurrences(null);
			
			System.out.println("testDeleteAllOccurrencesEmptyList - list looks like: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Expected exception: " + e.getClass().getSimpleName() + ", " + e.getMessage());
		}
		
	}
	
	
	public static void testDeleteAllOccurrencesOneItemListItemNotThere() {
		try{
			int count;
			list.addFirst("single item");
			count = list.deleteAllOccurrences("apple");
			
			
			System.out.println("testDeleteAllOccurrencesOneItemListItemNotThere - list looks like: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testDeleteAllOccurrencesOneItemListItemNotThere: " + e.getMessage());
		}
		
	}
	
	
	public static void testDeleteAllOccurrencesOneItemListItemIsThere() {
		try{
			int count;
			list.addFirst("apple");
			count = list.deleteAllOccurrences("apple");
			
			System.out.println("testDeleteAllOccurrencesOneItemListItemIsThere - list looks like: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testDeleteAllOccurrencesOneItemListItemIsThere: " + e.getMessage());
		}
		
	}
	
	
	public static void testDeleteAllOccurrencesDuplicateFiveItemListItemIsThere() {
		try{
			int count;
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("apple");
			count = list.deleteAllOccurrences("apple");
			
			System.out.println("testDeleteAllOccurrencesDuplicateFiveItemListItemIsThere - list looks like: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testDeleteAllOccurrencesDuplicateFiveItemListItemIsThere: " + e.getMessage());
		}
		
	}
	
	
	public static void testDeleteAllOccurrencesFiveItemListItemIsThere3Times() {
		try{
			int count;
			list.addFirst("apple");
			list.addFirst("banana");
			list.addFirst("apple");
			list.addFirst("cherry");
			list.addFirst("apple");
			count = list.deleteAllOccurrences("apple");
			
			System.out.println("testDeleteAllOccurrencesFiveItemListItemIsThere3Times - list looks like: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testDeleteAllOccurrencesFiveItemListItemIsThere3Times: " + e.getMessage());
		}
		
	}
	
	
	public static void testDeleteAllOccurrences5ItemListItemIsThere2Times() {
		try{
			int count;
			list.addFirst("apple");
			list.addFirst("apple");
			list.addFirst("grape");
			list.addFirst("cherry");
			list.addFirst("banana");
			count = list.deleteAllOccurrences("apple");
			
			System.out.println("testDeleteAllOccurrences5ItemListItemIsThere2Times - list looks like: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testDeleteAllOccurrences5ItemListItemIsThere2Times: " + e.getMessage());
		}
		
	}
	
	
	public static void testDeleteAllOccurrences5ItemListItemIsThere1Time() {
		try{
			int count;
			list.addFirst("apple");
			list.addFirst("pineapple");
			list.addFirst("grape");
			list.addFirst("cherry");
			list.addFirst("banana");
			count = list.deleteAllOccurrences("apple");
			
			System.out.println("testDeleteAllOccurrences5ItemListItemIsThere1Time - list looks like: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("Exception occurred in testDeleteAllOccurrences5ItemListItemIsThere1Time: " + e.getMessage());
		}
		
	}


	public static void main(String[] args) {
		setUp();
		testDeleteAllOccurrencesEmptyList();
		setUp();
		testDeleteAllOccurrencesDataIsNull();
		setUp();
		testDeleteAllOccurrencesOneItemListItemNotThere();
		setUp();
		testDeleteAllOccurrencesOneItemListItemIsThere();
		setUp();
		testDeleteAllOccurrencesDuplicateFiveItemListItemIsThere();
		setUp();
		testDeleteAllOccurrencesFiveItemListItemIsThere3Times();
		setUp();
		testDeleteAllOccurrences5ItemListItemIsThere2Times();
		setUp();
		testDeleteAllOccurrences5ItemListItemIsThere1Time();

	}

}
/*
testDeleteAllOccurrencesEmptyList - list looks like: 
List size is: 0

Expected exception: IllegalArgumentException, data passed to deleteAllOccurrences was null
testDeleteAllOccurrencesOneItemListItemNotThere - list looks like: 
List size is: 1
single item

testDeleteAllOccurrencesOneItemListItemIsThere - list looks like: 
List size is: 0

testDeleteAllOccurrencesDuplicateFiveItemListItemIsThere - list looks like: 
List size is: 0

testDeleteAllOccurrencesFiveItemListItemIsThere3Times - list looks like: 
List size is: 2
cherry
banana

testDeleteAllOccurrences5ItemListItemIsThere2Times - list looks like: 
List size is: 3
banana
cherry
grape

testDeleteAllOccurrences5ItemListItemIsThere1Time - list looks like: 
List size is: 4
banana
cherry
grape
pineapple

*/