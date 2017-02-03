package cscd211Inheritance;

public class Undergrad extends Student {
	private int gradYear;

	public Undergrad(String name, int id, int year) {
		super(name, id);
		if (year < 2000)
			throw new IllegalArgumentException("Year too low");
		this.gradYear = year;
	}

	public int getGrad() {
		return this.gradYear;
	}

	@Override
	public String toString() {
		return "UnderGrad-- " + super.toString() + "Grad: " + gradYear + " ";
	}
}
