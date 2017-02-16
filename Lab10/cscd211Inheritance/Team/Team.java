package cscd211Inheritance.Team;

import java.util.ArrayList;

import cscd211Inheritance.Players.Player;
import cscd211Interfaces.Taxable;

public class Team implements Taxable, Comparable<Team> {

	static int BASE_PAYROLL = 200000;
	protected String city;
	protected int payroll;
	protected ArrayList<Comparable> players;
	protected String teamName;

	public Team(String city, String teamName, Player[] players) throws java.lang.CloneNotSupportedException {

		if (city == null || teamName == null || players == null || city.isEmpty() || teamName.isEmpty()) {
			throw new IllegalArgumentException("Strings or player is null/empty");
		}

		this.city = city;
		this.teamName = teamName;
		this.players = players;
	}

	public ArrayList<Comparable> getPlayers() {
		return this.players;
	}

	public String getCity() {
		return this.city;
	}

	public int getPayroll() {
		return this.payroll;
	}

	@Override
	public String toString() {

		return "city - " + this.teamName + "\n Payroll: " + this.payroll + "\n Taxes: " + this.calculateTaxes()
				+ "\n Player Name SSN Salary Position Stats " + "\n" + Player.toString(); // plus
																							// the
																							// player
																							// info
	}

	@Override
	public int compareTo(Team arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateTaxes() {
		// TODO Auto-generated method stub
		return 0;
	}

}
