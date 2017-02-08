import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListAddAtIndexMain {
	
	private static LinkedList list;
	
		
	public static void setUp() {
		list = new LinkedList();
		
	}

	
	public static void testAddAtNegativeIndexIntObject() {
		try{
			list.addFirst("first");
			list.addAtIndex(-1, "new item");
		}
		catch (Exception e){
			System.out.println("Intentional exception occurred in testAddAtNegativeIndexIntObject: " + 
					e.getClass().getSimpleName() + ", " + e.getMessage());
		}
		
	
	}
	
	
	public static void testAddAtTooLargeIndexIntObject() {
		try{
			list.addFirst("first");
			list.addAtIndex(2, "new item");
		}
		catch (Exception e){
			System.out.println("\r\nIntentional exception occurred in testAddAtTooLargeIndexIntObject: " + 
					e.getClass().getSimpleName() + ", "+ e.getMessage());
		}
	
	}
	
	
	public static void testAddAtIndexIntObjectIsNull() {
		try{
			list.addFirst("first");
			String s = null;
			list.addAtIndex(0, s);
		}
		catch (Exception e){
			System.out.println("\r\nIntentional exception occurred in testAddAtIndexIntObjectIsNull: " + 
					 e.getClass().getSimpleName() + ", "+ e.getMessage());
		}

	}
	
	
	public static void testAddAtIndexSameAsSizeIntObject() {
		try{
			list.addFirst("first");
			list.addAtIndex(1, "new item");
			System.out.println("\r\ntestAddAtIndexSameAsSizeIntObject yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testAddAtIndexSameAsSizeIntObject: " + e.getMessage());
		}
	}
	
	
	
	public static void testAddAtIndex0IntObject() {
		try{
			list.addFirst("first");
			list.addAtIndex(0, "new item");
			System.out.println("testAddAtIndex0IntObject yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testAddAtIndex0IntObject: " + e.getMessage());
		}
	}
	
	
	public static void testAddAtIndex0ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(0, "new item");
			System.out.println("testAddAtIndex0ListSize7IntObject yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testAddAtIndex0ListSize7IntObject: " + e.getMessage());
		}
	}
	
	
	public static void testAddAtIndex2ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(2, "new item");
			System.out.println("testAddAtIndex2ListSize7IntObject yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testAddAtIndex2ListSize7IntObject: " + e.getMessage());
		}
	}
	
	
	public static void testAddAtIndex3ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(3, "new item");
			System.out.println("testAddAtIndex3ListSize7IntObject yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testAddAtIndex3ListSize7IntObject: " + e.getMessage());
		}
	}
	
	
	public static void testAddAtIndex6ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(6, "new item");
			System.out.println("testAddAtIndex6ListSize7IntObject yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testAddAtIndex6ListSize7IntObject: " + e.getMessage());
		}
	}
	
	
	public static void testAddAtIndex7ListSize7IntObject() {
		try{
			list.addFirst("6");
			list.addFirst("5");
			list.addFirst("4");
			list.addFirst("3");
			list.addFirst("2");
			list.addFirst("1");
			list.addFirst("0");
			
			list.addAtIndex(7, "new item");
			System.out.println("testAddAtIndex7ListSize7IntObject yields: \r\n" + list.toString());
		}
		catch(Exception e){
			System.out.println("\r\nException occurred in testAddAtIndex7ListSize7IntObject: " + e.getMessage());
		}
	}


	public static void main(String[] args) {

		setUp();
		testAddAtNegativeIndexIntObject();
		setUp();
		testAddAtTooLargeIndexIntObject();
		setUp();
		testAddAtIndexIntObjectIsNull();
		setUp();
		testAddAtIndexSameAsSizeIntObject();
		setUp();
		testAddAtIndex0IntObject();
		setUp();
		testAddAtIndex0ListSize7IntObject();
		setUp();
		testAddAtIndex2ListSize7IntObject();
		setUp();
		testAddAtIndex3ListSize7IntObject();
		setUp();
		testAddAtIndex6ListSize7IntObject();
		setUp();
		testAddAtIndex7ListSize7IntObject();

	}

}
/*
Intentional exception occurred in testAddAtNegativeIndexIntObject: IllegalArgumentException, index to addAtIndex was -1, it should be from 0 to 1

Intentional exception occurred in testAddAtTooLargeIndexIntObject: IllegalArgumentException, index to addAtIndex was 2, it should be from 0 to 1

Intentional exception occurred in testAddAtIndexIntObjectIsNull: IllegalArgumentException, data passed to addAtIndex was null

testAddAtIndexSameAsSizeIntObject yields: 
List size is: 2
first
new item

testAddAtIndex0IntObject yields: 
List size is: 2
new item
first

testAddAtIndex0ListSize7IntObject yields: 
List size is: 8
new item
0
1
2
3
4
5
6

testAddAtIndex2ListSize7IntObject yields: 
List size is: 8
0
1
new item
2
3
4
5
6

testAddAtIndex3ListSize7IntObject yields: 
List size is: 8
0
1
2
new item
3
4
5
6

testAddAtIndex6ListSize7IntObject yields: 
List size is: 8
0
1
2
3
4
5
new item
6

testAddAtIndex7ListSize7IntObject yields: 
List size is: 8
0
1
2
3
4
5
6
new item

*/
