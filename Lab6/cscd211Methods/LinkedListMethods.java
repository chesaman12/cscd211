package cscd211Methods;

import java.util.Scanner;

import cscd211Classes.BoxCar;

public class LinkedListMethods {

	public static int menu(Scanner kb)
	{
		if(kb == null) throw new IllegalArgumentException("Scanner is null");
		System.out.println("1) Print the List ");
		System.out.println("2) Create a BoxCar and addFirst ");
		System.out.println("3) Create a BoxCar and addLast ");
		System.out.println("4) Create a BoxCar, read and index and add -- at the index ");
		System.out.println("5) Create a BoxCar, check the list to see if the list contains the BoxCar ");
		System.out.println("6) Create a BoxCar, find the indexOf that BoxCar ");
		System.out.println("7) removeFirst ");
		System.out.println("8) removeLast ");
		System.out.println("9) Read index remove Node at that index ");
		System.out.println("10) Create a BoxCar and removeFirstOccurrence of that BoxCar ");
		System.out.println("11) Create a BoxCar and removeLastOccurrence of that BoxCar ");
		System.out.println("12) clear the list ");
		System.out.println("13) Print the size of the list ");
		System.out.println("14) Quit");
		
		int input;
		do{
			System.out.println("Please enter a valid int (1-14)");
			input = Integer.parseInt(kb.nextLine());		
		}while(input <= 0 || input > 15);
			return input;
		
	}
	

	public static int readIndex(java.util.Scanner kb)
	{
		if(kb == null) throw new IllegalArgumentException("Scanner is null");
		
		int input;
		do{
			System.out.println("Please enter a valid int (greater then -1)");
			input = Integer.parseInt(kb.nextLine());		
		}while(input <= -1 );
			return input;
		
	}
	
	public static BoxCar createBoxCar(Scanner kb)
	{
		if(kb == null) throw new IllegalArgumentException("Scanner is null");
		
		System.out.println("Enter a box car as a string: ");
		String bc = kb.nextLine();
		
		return new BoxCar(bc);
		
	}

}
