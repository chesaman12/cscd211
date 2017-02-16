package cscd211Inheritance.Players;

public class Player implements Comparable<Player>, Cloneable {
	protected String firstName;
	protected String lastName;
	protected String position;
	protected int salary;
	protected String ssn;

	protected Player(String firstName, String lastName, String ssn, int salary, String position) {
		if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty() || position == null
				|| position.isEmpty() || ssn == null || ssn.isEmpty())
			throw new IllegalArgumentException("firstName, lastName, ssn, or posistion is null or empty");

		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.ssn = ssn;
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}

	public String getName() {
		return this.firstName + this.lastName;
	}

	public String getSSN() {
		return this.ssn;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String toString() {
		return getName() + " " + this.ssn + " " + this.salary + " " + this.position;

	}

	public int compareTo(Player pi) {
		if (pi == null)
			throw new IllegalArgumentException("Pi is null");
		if (this.lastName == pi.firstName) {
			return this.firstName.compareTo(pi.firstName);
		}
		return this.lastName.compareTo(pi.lastName);

	}

	@Override
	public Player clone() throws CloneNotSupportedException {
		return (Player) super.clone();

	}

}
