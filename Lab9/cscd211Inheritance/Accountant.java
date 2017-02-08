package cscd211Inheritance;

public class Accountant extends Employee {
	private double parkingStipend;

	public Accountant(String name, double basePayrate, double additionalPayrate, double parkingStipend) {
		super(name, basePayrate, additionalPayrate);
		if (parkingStipend < 1.00)
			throw new IllegalArgumentException("parkingStipend less then 1");
		this.parkingStipend = parkingStipend;
	}

	public double getParkingStipend() {
		return this.parkingStipend;
	}

	public void setParkingStipend(double parkingStipend) {
		this.parkingStipend = parkingStipend;
	}

	@Override
	public void report() {
		System.out.println("I am an accountant. I make " + super.getBaseSalary() + " plus a parking stipend of "
				+ this.parkingStipend + " dollars.");

	}

	@Override
	public String toString() {
		return "Accountant: " + super.toString();
	}
}
