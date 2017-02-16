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
		this.players = new ArrayList<Comparable>(players.length);
		for (Player p : players)
			this.players.add(p.clone());
		this.payroll = this.sumPayRoll();
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
				+ "\n Player Name SSN Salary Position Stats " + "\n" + this.players;
	}

	@Override
	public int compareTo(Team pi) {
		// Compares first by City and then teamName if city is the same
		if (pi == null)
			throw new IllegalArgumentException("Team is null");
		if (this.city == pi.city)
			return this.teamName.compareTo(pi.teamName);
		return this.city.compareTo(pi.city);
	}

	@Override
	public double calculateTaxes() {
		// Calculate Taxes Walks thru the array list if a player salary is
		// greater than 250000 taxes are the salary * BASE_TAX_RATE if salary is
		// less than or equal to 250000 the taxes are salary*(BASE_TAX_RATE / 2)
		return 0;
	}

	protected int sumPayRoll() {
		// protected sumPayroll - sums the player salary to create the payroll
		// Walks thru the ArrayList and sums the player salaries
		return 0;
	}

}
