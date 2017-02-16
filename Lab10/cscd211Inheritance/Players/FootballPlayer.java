package cscd211Inheritance.Players;

public class FootballPlayer extends Player implements Cloneable {

	protected int td;

	protected FootballPlayer(String firstName, String lastName, String ssn, int salary, String position, int td) {
		super(firstName, lastName, ssn, salary, position);

		if (td < 0)
			throw new IllegalArgumentException("No touchdowns");

		this.td = td;
	}

	@Override
	public String toString() {
		return super.toString() + "	Touchdowns: " + this.td;
	}

	@Override
	public FootballPlayer clone() throws java.lang.CloneNotSupportedException {
		// Returns super.clone() cast to a FootballPlayer
		return (FootballPlayer) super.clone();
	}
}
