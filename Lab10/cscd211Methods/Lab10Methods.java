package cscd211Methods;

import java.util.ArrayList;
import java.util.Scanner;

import cscd211Inheritance.Team.Team;

public class Lab10Methods {
	public static int menu(Scanner kb) {
		if (kb == null)
			throw new IllegalArgumentException("Scanner is null");
		System.out.println("1) Print all Teams  ");
		System.out.println("2) Sort all Players on each Team by last name then first ");
		System.out.println("3) Sort all Teams by city and team name ");
		System.out.println("4) Sort all Teams by Payroll ");
		System.out.println("5) Exit program ");

		int input;
		do {
			System.out.println("Please enter a valid int (1-5)");
			input = Integer.parseInt(kb.nextLine());
		} while (input <= 0 || input > 6);
		return input;

	}

	public static void fill(Scanner fin, ArrayList<Team> myTeam) throws java.lang.CloneNotSupportedException {
		if (fin == null || myTeam == null)
			throw new IllegalArgumentException("fin or team is null");

	}
}
