package cscd211Inheritance.Players;

public class BaseballPlayer extends Player implements Cloneable {

	protected double batAvg;

	protected BaseballPlayer(String firstName, String lastName, String ssn, int salary, String position,
			double batAvg) {
		super(firstName, lastName, ssn, salary, position);

		if (batAvg < 0)
			throw new IllegalArgumentException("Bat avg is less then 0");

		this.batAvg = batAvg;
	}

	@Override
	public String toString() {
		return super.toString() + this.batAvg;
	}

	@Override
	public BaseballPlayer clone() throws java.lang.CloneNotSupportedException {
		// BaseballPlayer The cloned baseball player
		return null;
	}
}
