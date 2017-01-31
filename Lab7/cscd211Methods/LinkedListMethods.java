package cscd211Methods;

import java.util.Scanner;

import cscd211Classes.BoxCar;

public class LinkedListMethods {
	public static int menu(Scanner kb) {
		if (kb == null)
			throw new IllegalArgumentException("Scanner is null");
		System.out.println("1) Print the List ");
		System.out.println("2) Create a BoxCar and append the specified element to the end of this list ");
		System.out.println("3) addAll(index, array)  ");
		System.out.println("4) Read an index and get the data at that index  ");
		System.out.println("5) getLast ");
		System.out.println("6) remove ");
		System.out.println("7) removeIndex ");
		System.out.println("8) removeLast ");
		System.out.println("9) toArray  ");
		System.out.println("10) clear the list  ");
		System.out.println("11) Print the size of the list  ");
		System.out.println("12) Quit ");

		int input;
		do {
			System.out.println("Please enter a valid int (1-12)");
			input = Integer.parseInt(kb.nextLine());
		} while (input <= 0 || input > 13);
		return input;

	}

	public static int readIndex(java.util.Scanner kb) {
		if (kb == null)
			throw new NullPointerException("Scanner is null");

		int input;
		do {
			System.out.println("Please enter a valid int (greater then -1)");
			input = Integer.parseInt(kb.nextLine());
		} while (input <= -1);
		return input;

	}

	public static BoxCar createBoxCar(Scanner kb) {
		if (kb == null)
			throw new NullPointerException("Scanner is null");

		System.out.println("Enter a box car as a string: ");
		String bc = kb.nextLine();

		return new BoxCar(bc);

	}

	public static BoxCar[] fillArray(Scanner kb, int total) {

		if (kb == null)
			throw new NullPointerException("Scanner is null");
		if (total < 1)
			throw new IllegalArgumentException("Must have at least one boxcar to enter");
		BoxCar[] BoxCar = new BoxCar[total];

		for (int ix = 0; ix < total; ix++) {
			// System.out.println("Please enter BoxCar number " + ix + ":");
			BoxCar[ix] = createBoxCar(kb);
		}
		return BoxCar;
	}
}
